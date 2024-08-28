@echo off
setlocal

REM Define the branch you are working with
set BRANCH_NAME=main

REM Check if we are inside a Git repository
if not exist .git (
    echo This is not a git repository. Please run this script inside a git repository.
    exit /b 1
)

REM Fetch the latest updates from the remote repository
git fetch origin

REM Get the commit hashes for comparison
for /f "tokens=*" %%i in ('git rev-list HEAD') do set LOCAL_HASH=%%i
for /f "tokens=*" %%i in ('git rev-list origin/%BRANCH_NAME%') do set REMOTE_HASH=%%i

REM Get the number of commits the local branch is behind or ahead
for /f "tokens=*" %%i in ('git rev-list HEAD..origin/%BRANCH_NAME% ^| find /c /v ""') do set LOCAL_BEHIND=%%i
for /f "tokens=*" %%i in ('git rev-list origin/%BRANCH_NAME%..HEAD ^| find /c /v ""') do set LOCAL_AHEAD=%%i

REM Compare local and remote branches
if %LOCAL_BEHIND% gtr 0 (
    echo Your local branch is behind the remote branch. Pulling the latest changes...
    git pull origin %BRANCH_NAME%
) else if %LOCAL_AHEAD% gtr 0 (
    echo Your local branch is ahead of the remote branch. Pushing your changes...
    git push origin %BRANCH_NAME%
) else (
    echo Your local branch and the remote branch are in sync.
)

endlocal
