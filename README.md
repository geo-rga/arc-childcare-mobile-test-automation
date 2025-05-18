# 🧪 ARC Blood Appium Test Automation Framework

A cross-platform **TestNG + Appium** mobile test automation project for the ARC Blood application, supporting both **Android** and **iOS** on real devices.

---

## 📁 Project Structure

```
src/
├── main/java/com/cube/qa/arcblood/
│   ├── config         # TestConfig, ConfigLoader
│   ├── pages          # Page Object Model (POM)
│   └── utils          # DriverManager, BasePage
├── test/java/tests    # Test classes (TestNG)
└── test/resources/
    └── apps/          # APK & IPA binaries (not committed)
        ├── android/
        └── ios/

testng.xml             # Combined test suite (parallel)
testng-android.xml     # Android-only suite
testng-ios.xml         # iOS-only suite
pom.xml                # Maven configuration
.gitignore             # Excludes platform-specific & large files
```

---

## 🚀 Getting Started

### ✅ Prerequisites

- Java 17+
- Maven
- Appium Server running (`appium` or Appium Desktop)
- Real Android or iOS device connected
- `build`, `udid`, and `platform` set via testng or CLI

---

## ⚙️ Configuration

### `testng.xml` Example

```xml
<parameter name="platform" value="android"/>
<parameter name="build" value="src/test/resources/apps/android/app.apk"/>
<parameter name="udid" value="YOUR_DEVICE_UDID"/>
<parameter name="fullReset" value="true"/>
```

Set `fullReset` to `"true"` to install a fresh app each time, or `"false"` to retain app data.

---

## 🧠 Locator Strategy & Fallbacks

Each page defines element locators using a **primary + fallback** approach. For example:

```java
welcomeLoginLocators = Arrays.asList(
    By.id("broken_id"),
    By.xpath("//android.widget.Button[@text='LOG IN']")
);
```

Only the first working and visible locator will be used. This increases resilience across versions/platforms.

---

## 🧪 Running Tests

### 1. Cross-Platform

Runs both Android & iOS tests:

```bash
mvn test
```

### 2. Platform-Specific

Android:

```bash
mvn test -DsuiteXmlFile=testng-android.xml
```

iOS:

```bash
mvn test -DsuiteXmlFile=testng-ios.xml
```

### 3. Custom CLI Overrides

```bash
mvn test -Dplatform=android -Dbuild=path/to.apk -Dudid=your_device_udid -DfullReset=true
```

---

## 🔀 Parallel Execution

Defined in `testng.xml` with:

```xml
<suite name="Cross Platform Suite" parallel="tests" thread-count="2">
```

This allows Android and iOS tests to run **simultaneously**, each on a dedicated thread/device.

---

## 🧹 .gitignore Highlights

- App binaries:
    - `*.apk`, `*.ipa`
- Build output:
    - `/target/`, `/build/`, `/out/`
- IDEs: `.idea/`, `.vscode/`
- Logs: `*.log`, `appium.log`
- Test reports: `/surefire-reports/`, `/failsafe-reports/`

> Ensure binaries are placed locally at:
> `src/test/resources/apps/android/` and `src/test/resources/apps/ios/`

---

## 📦 Logging

The framework includes safe, thread-aware logging like:

```
[ANDROID | Thread-1] ▶ STARTING TEST: testWelcomeLoginButtonAppears
```

This helps distinguish test output during parallel runs.

---

## 💡 Tips

- ✅ You **do not** need to keep Xcode open to test on iOS
- ✅ Real devices must be connected and authorized via `adb devices` (Android) or `xcrun xctrace list devices` (iOS)
- ❌ APK and IPA files are **not committed** to version control
- 🧠 The framework automatically logs which locator fails or succeeds

---

## 📞 Troubleshooting

- App path incorrect? Double check the full path exists locally
- Device not connected? Run:
    - `adb devices` for Android
    - `xcrun xctrace list devices` for iOS
- App fails to start? Confirm Appium logs for errors and package/activity names

---

Happy Testing! 🧪💥