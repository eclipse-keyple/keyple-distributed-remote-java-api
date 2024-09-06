# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [3.1.0] - 2024-09-06
### Added
- Added a new method `Boolean isContactless()` to the `RemoteReaderSpi` interface.
  This method enables the main Keyple service to identify as soon as possible whether a remote reader is contactless or
  not, if this information has been transmitted to the remote lib. This reduces the number of network exchanges.

## [3.0.1] - 2024-04-12
### Changed
- Java source and target levels `1.6` -> `1.8`
### Upgraded
- Gradle `6.8.3` -> `7.6.4`

## [3.0.0] - 2023-11-27
### Added
- Added a new method `int exchangeApiLevel(int coreApiLevel)` to the `AbstractRemotePluginSpi` interface to enable Core 
  and Distributed layers to exchange their JSON API levels.
- Added project status badges on `README.md` file.
### Changed
- Updated the signature of the method `addRemoteReader` in the `ObservableRemotePluginApi` interface.
  The original signature was `void addRemoteReader(RemoteReaderSpi remoteReaderSpi)`, 
  and it has now been modified to `void addRemoteReader(RemoteReaderSpi remoteReaderSpi, int clientCoreApiLevel)`.
  The new `clientCoreApiLevel` parameter will enable the Distributed layer to transmit the client's Core layer API level
  to the server's Core layer when a reader creation request is made.
### Fixed
- CI: code coverage report when releasing.

## [2.1.0] - 2023-02-17
### Added
- The possibility to provide to the observable remote plugin a custom executor service to be used to asynchronously 
  notify remote reader connection events (see new method `ObservableRemotePluginSpi.getExecutorService`).
- `CHANGELOG.md` file (issue [eclipse-keyple/keyple#6]).
- CI: Forbid the publication of a version already released (issue [#3])

## [2.0.0] - 2021-10-06
This is the initial release.
It follows the extraction of Keyple 1.0 components contained in the `eclipse-keyple/keyple-java` repository to dedicated
repositories.
It also brings many major API changes.

[unreleased]: https://github.com/eclipse-keyple/keyple-distributed-remote-java-api/compare/3.1.0...HEAD
[3.1.0]: https://github.com/eclipse-keyple/keyple-distributed-remote-java-api/compare/3.0.1...3.1.0
[3.0.1]: https://github.com/eclipse-keyple/keyple-distributed-remote-java-api/compare/3.0.0...3.0.1
[3.0.0]: https://github.com/eclipse-keyple/keyple-distributed-remote-java-api/compare/2.1.0...3.0.0
[2.1.0]: https://github.com/eclipse-keyple/keyple-distributed-remote-java-api/compare/2.0.0...2.1.0
[2.0.0]: https://github.com/eclipse-keyple/keyple-distributed-remote-java-api/releases/tag/2.0.0

[#3]: https://github.com/eclipse-keyple/keyple-distributed-remote-java-api/issues/3

[eclipse-keyple/keyple#6]: https://github.com/eclipse-keyple/keyple/issues/6