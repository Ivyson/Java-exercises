import numpy as np
import matplotlib.pyplot as plt

# Constants
omega_c = np.pi/6   # omega_c = 1/6π
f = 243.33               # Frequency in Hz
omega = 2 * np.pi * f     # Omega (rad/s)

# Time and Frequency ranges
t = np.linspace(-10, 10, 1000)   # Time domain
omega_vals = np.linspace(-2000, 2000, 1000)  # Frequency domain

# Function f(t) = 2cos(1/6π t)
f_t = 2 * np.cos(omega_c * t * np.pi)

# Fourier Transform Magnitude |F(ω)| = |ω / (ω_c^2 - ω^2)|
def fourier_transform_magnitude(omega, omega_c):
    return np.abs(omega / (omega_c**2 - omega**2))

# Plot f(t)
plt.figure(figsize=(10, 5))

plt.subplot(1, 2, 1)
plt.plot(t, f_t, label=r'$f(t) = 2\cos\left(\frac{1}{6}\pi t\right)$')
plt.title('Time Domain Function $f(t)$')
plt.xlabel('Time (t)')
plt.ylabel('$f(t)$')
plt.grid(True)
plt.legend()

# Plot Fourier Transform Magnitude
plt.subplot(1, 2, 2)
magnitude = fourier_transform_magnitude(omega_vals, omega_c)
plt.plot(omega_vals, magnitude, label=r'$\frac{j\omega}{\omega_c^2 - \omega^2}$')
plt.title('Fourier Transform Magnitude $|F(\omega)|$')
plt.xlabel('Frequency (rad/s)')
plt.ylabel('$|F(\omega)|$')
plt.grid(True)
plt.legend()

plt.tight_layout()
plt.show()

# Calculate the magnitude at ω = 2π * 243.33
omega_target = 2 * np.pi * 243.33
magnitude_at_omega_target = fourier_transform_magnitude(omega_target, omega_c)
print(f"Magnitude of Fourier Transform at ω = {omega_target:.2f} rad/s: {magnitude_at_omega_target:.5f}")