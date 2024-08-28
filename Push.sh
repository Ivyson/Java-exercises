#!/bin/bash

# Name of the branch you are working with
BRANCH_NAME="main"

# Check if the local repository is a git repository
if [ ! -d ".git" ]; then
  echo "This is not a git repository. Please run this script inside a git repository."
  exit 1
fi

# Fetch the latest updates from the remote repository
git fetch origin

# Get the local and remote branch status
LOCAL_COMMITS=$(git rev-list --count HEAD)
REMOTE_COMMITS=$(git rev-list --count origin/$BRANCH_NAME)

# Get the difference between the local and remote branches
LOCAL_BEHIND=$(git rev-list --count HEAD..origin/$BRANCH_NAME)
LOCAL_AHEAD=$(git rev-list --count origin/$BRANCH_NAME..HEAD)

# Compare local and remote branches
if [ "$LOCAL_BEHIND" -gt 0 ]; then
  echo "Your local branch is behind the remote branch. Pulling the latest changes..."
  git pull origin $BRANCH_NAME
elif [ "$LOCAL_AHEAD" -gt 0 ]; then
  echo "Your local branch is ahead of the remote branch. Pushing your changes..."
  git push origin $BRANCH_NAME
else
  echo "Your local branch and the remote branch are in sync."
fi
