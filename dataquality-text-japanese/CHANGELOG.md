# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]
### Added
N/A
### Changed
N/A
### Removed
N/A
### Deprecated
N/A
### Fixed
N/A
### Security
N/A

## [17.0.3] - 2023-12-20
### Fixed
- fix([TDQ-21269](https://jira.talendforge.org/browse/TDQ-21269)): Remove dependency 'm2e'

## [17.0.2] - 2023-07-03
### Changed
- fix([TDQ-21242](https://jira.talendforge.org/browse/TDQ-21242)): Build DQ libs with Java 17

## [17.0.1] - 2023-06-27

## [9.1.13] - 2023-05-11

## [9.1.12] - 2023-01-03

## [9.1.11] - 2022-12-14
### Changed
chore([TDQ-20862](https://jira.talendforge.org/browse/TDQ-20862)): Remove jars from git and download it when build
### Security
- fix([TDQ-20851](https://jira.talendforge.org/browse/TDQ-20851)): Upgrade slf4j to 1.7.34

## [9.1.10] - 2022-11-10

## [9.1.9] - 2022-10-13

## [9.1.8] - 2022-09-15

## [9.1.7] - 2022-08-11

## [9.1.6] - 2022-07-14

## [9.1.5] - 2022-05-12

## [9.1.4] - 2022-04-14

## [9.1.3] - 2022-03-03

## [9.1.2] - 2022-02-04

## [9.1.1] - 2022-01-07
### Security
- fix([TDQ-20024](https://jira.talendforge.org/browse/TDQ-20024)): upgrade 'log4j-core' to 2.17.1

## [9.1.0] - 2021-12-15
### Security
- fix([TDQ-19973](https://jira.talendforge.org/browse/TDQ-19973)): upgrade 'log4j-core' to 2.16.0

## [9.0.2] - 2021-10-14

## [9.0.1] - 2021-10-07

## [9.0.0] - 2021-06-02

## [8.3.1] - 2020-11-18

## [8.3.0] - 2020-07-16

## [8.2.0] - 2020-06-18

## [8.1.0] - 2020-03-13

## [8.0.0] - 2020-02-03
### Added
- chore([TDQ-17710](https://jira.talendforge.org/browse/TDQ-17710)): Adopt the "Keep a Changelog" format for changelogs

## [6.0.0] - 2018-07-03
- [TDQ-15285](https://jira.talendforge.org/browse/TDQ-15285) correct initialization-on-demand holder, the init of tokenizer should inside constructor
- [TDQ-14628](https://jira.talendforge.org/browse/TDQ-14628) japanese to arabic numbers transliteration
- [TDQ-15470](https://jira.talendforge.org/browse/TDQ-15470) do not allow bnd to generate package import to avoid breaking the build even we forget to export the new packages + rename the project name to org.talend... to align with other projects
- [TDQ-15470](https://jira.talendforge.org/browse/TDQ-15470) export package to fix compiler error
- [TDQ-14587](https://jira.talendforge.org/browse/TDQ-14587) api jp transliteration
- [TDQ-15345](https://jira.talendforge.org/browse/TDQ-15345) rename dq text japanese
