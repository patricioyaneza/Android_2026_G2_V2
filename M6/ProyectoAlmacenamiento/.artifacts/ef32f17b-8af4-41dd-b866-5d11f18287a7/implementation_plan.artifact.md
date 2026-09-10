# Implementation Plan - Fix KSP "unexpected jvm signature V" error

The error `[ksp] java.lang.IllegalStateException: unexpected jvm signature V` occurs because the KSP (Kotlin Symbol Processing) version is not compatible with the Kotlin version being used, or it's hitting a known bug in KSP's handling of `suspend` functions returning `Unit` (signature `V`) in Kotlin 2.x.

In your project:
- **Kotlin Version:** `2.2.10`
- **KSP Version:** `2.0.21-1.0.26`

KSP versions must match the Kotlin version (e.g., `2.2.10-1.0.x`). Additionally, Room `2.6.1` is relatively old for such new Kotlin/KSP versions and might contribute to compatibility issues.

## Proposed Changes

### [Component Name] Build Configuration

#### [MODIFY] [libs.versions.toml](file:///C:/zPersonal/Android Trainee TD/Android_2026_G2_V2/M6/ProyectoAlmacenamiento/gradle/libs.versions.toml)
- Update `ksp` version to `2.2.10-1.0.27` to match the Kotlin version.
- Update `room` version (if defined in toml) or prepare to update it in `build.gradle.kts`.

#### [MODIFY] [app/build.gradle.kts](file:///C:/zPersonal/Android Trainee TD/Android_2026_G2_V2/M6/ProyectoAlmacenamiento/app/build.gradle.kts)
- Update Room version to `2.8.5` to ensure compatibility with Kotlin 2.x and KSP 2.x.

## Verification Plan

### Automated Tests
- Run the KSP task specifically: `./gradlew :app:kspDebugKotlin`
- Run a full build: `./gradlew assembleDebug`

### Manual Verification
- Verify that the `UsuarioDAO` classes are correctly generated in `build/generated/ksp`.
