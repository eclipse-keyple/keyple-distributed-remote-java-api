# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]
### Added
- Added project status badges on `README.md` file.
### Fixed
- CI: code coverage report when releasing.

## [2.1.0] - 2023-02-17
### Added
- The possibility to provide to the observable remote plugin a custom executor service to be used to asynchronously 
  notify remote reader connection events (see new method `ObservableRemotePluginSpi.getExecutorService`).
- `CHANGELOG.md` file (issue [eclipse/keyple#6]).
- CI: Forbid the publication of a version already released (issue [#3])

## [2.0.0] - 2021-10-06
This is the initial release.
It follows the extraction of Keyple 1.0 components contained in the `eclipse/keyple-java` repository to dedicated
repositories.
It also brings many major API changes.

[unreleased]: https://github.com/eclipse/keyple-distributed-remote-java-api/compare/2.1.0...HEAD
[2.1.0]: https://github.com/eclipse/keyple-distributed-remote-java-api/compare/2.0.0...2.1.0
[2.0.0]: https://github.com/eclipse/keyple-distributed-remote-java-api/releases/tag/2.0.0

[#3]: https://github.com/eclipse/keyple-distributed-remote-java-api/issues/3

[eclipse/keyple#6]: https://github.com/eclipse/keyple/issues/6