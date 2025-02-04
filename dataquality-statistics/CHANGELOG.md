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
### Security
- fix([TDQ-21323](https://jira.talendforge.org/browse/TDQ-21323)): upgrade daikon to 7.1.16
- fix([TDQ-21398](https://jira.talendforge.org/browse/TDQ-21398)): Upgrade jackson to 2.14.3

## [17.0.2] - 2023-07-03
### Changed
- fix([TDQ-21242](https://jira.talendforge.org/browse/TDQ-21242)): Build DQ libs with Java 17

## [9.1.13] - 2023-05-11
### Security
- fix([TDQ-21093](https://jira.talendforge.org/browse/TDQ-21093)): Unify jackson-databind version 2.13.4.2

## [9.1.12] - 2023-01-03
### Security
- fix([TDQ-20585](https://jira.talendforge.org/browse/TDQ-20585)): upgrade daikon to 7.0.5

## [9.1.11] - 2022-12-14
### Security
- fix([TDQ-20851](https://jira.talendforge.org/browse/TDQ-20851)): Upgrade slf4j to 1.7.34

## [9.1.10] - 2022-11-10
### Security
- fix([TDQ-20772](https://jira.talendforge.org/browse/TDQ-20772)): Fix jackson-databind issues (to 2.14.0-rc2)
- fix([TDQ-20792](https://jira.talendforge.org/browse/TDQ-20792)): Fix all jackson jar(to 2.13.4)
- fix([TDQ-20799](https://jira.talendforge.org/browse/TDQ-20799)): Fix org.apache.commons:commons-text:1.8,1.9(to 1.10.0)

## [9.1.9] - 2022-10-13

## [9.1.8] - 2022-09-15

## [9.1.7] - 2022-08-11
### Changed
- chore([TDQ-20569](https://jira.talendforge.org/browse/TDQ-20569)): upgrade daikon to 6.8.7
### Security
- fix([TDQ-20580](https://jira.talendforge.org/browse/TDQ-20580)): Fix Apache Commons Configuration (to 2.8.0)

## [9.1.6] - 2022-07-14
### Security
- fix([TDQ-20481](https://jira.talendforge.org/browse/TDQ-20481)): upgrade daikon to 6.8.2

## [9.1.5] - 2022-05-12
### Security
- fix([TDQ-20210](https://jira.talendforge.org/browse/TDQ-20210)): Fix jackson-databind issues (to 2.13.2.2)

## [9.1.4] - 2022-04-14

## [9.1.3] - 2022-03-03
### Added
- wi([TDQ-20156](https://jira.talendforge.org/browse/TDQ-20156)): Provide a date/time/datetime pattern checker

## [9.1.2] - 2022-02-04
### Fixed
- Chore: remove useless avro dependency that pulls too much crap

## [9.1.1] - 2022-01-07
### Security
- fix([TDQ-20024](https://jira.talendforge.org/browse/TDQ-20024)): upgrade 'log4j-core' to 2.17.1

## [9.1.0] - 2021-12-15
### Security
- fix([TDQ-19973](https://jira.talendforge.org/browse/TDQ-19973)): upgrade 'log4j-core' to 2.16.0

## [9.0.2] - 2021-10-14
### Fixed
fix([TPRUN-2195](https://jira.talendforge.org/browse/TPRUN-2195)): Update get TimeZone Display Name

## [9.0.1] - 2021-10-07
### Fixed
- bug([TPRUN-2142](https://jira.talendforge.org/browse/TPRUN-2142)): Discard Time related logical types
- bug([TPRUN-2200](https://jira.talendforge.org/browse/TPRUN-2200)): Avoid crashing when a Locale is not supported in discovery
### Security
- fix([TDQ-19311](https://jira.talendforge.org/browse/TDQ-19311)): Fix Apache Commons IO issues (to 2.8.0)
- fix([TDQ-19616](https://jira.talendforge.org/browse/TDQ-19616)): Fix Apache Commons Compress issue (to 1.21)

## [9.0.0] - 2021-06-02
### Changed
- workitem([TPRUN-354](https://jira.talendforge.org/browse/TPRUN-354)): Improve "native" discovery for typed data
- chore([TPRUN-953](https://jira.talendforge.org/browse/TPRUN-953)): Refactor SortedList
### Security
- fix([TDQ-18897](https://jira.talendforge.org/browse/TDQ-18897)): Fix org.apache.httpcomponents:httpclient issue
- fix([TDQ-19066](https://jira.talendforge.org/browse/TDQ-19066)): Fix jackson-databind issues
- fix([TDQ-19073](https://jira.talendforge.org/browse/TDQ-19073)): Fix JUnit issue
- fix([TDQ-19045](https://jira.talendforge.org/browse/TDQ-19045)): Update Jackson Databind to 2.11.4
- fix([TDQ-19124](https://jira.talendforge.org/browse/TDQ-19124)): Upgrade Daikon to 5.3.0
- fix([TDQ-19292](https://jira.talendforge.org/browse/TDQ-19292)): Fix Data Mapper for Jackson issues

## [8.3.1] - 2020-11-18
### Security
- fix([TDQ-17694](https://jira.talendforge.org/browse/TDQ-17694)): Fix Jackson Data Mapper Issues
- fix([TDQ-18385](https://jira.talendforge.org/browse/TDQ-18385)): Fix Apache Common Codec issues

## [8.3.0] - 2020-07-16
### Added
- feat([TDQ-18422](https://jira.talendforge.org/browse/TDQ-18422)): Avro analyzers management

## [8.2.0] - 2020-06-18
### Added
- feat([TDQ-18441](https://jira.talendforge.org/browse/TDQ-18441)): support 8 additional ISO-8601 datetime patterns and 24 additional time patterns

## [8.1.0] - 2020-03-13

## [8.0.0] - 2020-02-03
### Added
- chore([TDQ-17710](https://jira.talendforge.org/browse/TDQ-17710)): Adopt the "Keep a Changelog" format for changelogs
- chore([TDQ-17993](https://jira.talendforge.org/browse/TDQ-17993)): Support German timezone strings for any default JVM locale
### Changed
- chore([TDS-764](https://jira.talendforge.org/browse/TDS-764)): adding getter to retrieve statistics map
- chore([TDQ-17788](https://jira.talendforge.org/browse/TDQ-17788)): cancel the deprecation of setStoreInvalidValues in QualityAnalyzer implementations
### Removed
- chore([TDQ-17788](https://jira.talendforge.org/browse/TDQ-17788)): remove deprecated classes EastAsianCharPatternRecognizer, DateTimePatternManager, and CustomDateTimePatternPatternManager
- chore([TDQ-17788](https://jira.talendforge.org/browse/TDQ-17788)): remove a deprecated constructor of ValueQualityAnalyzer
- chore([TDQ-17788](https://jira.talendforge.org/browse/TDQ-17788)): remove deprecated methods in class SystemDateTimePatternManager and TypeInferenceUtils

## [6.0.0] - 2018-07-03
- [TDQ-14001](https://jira.talendforge.org/browse/TDQ-14001) improve pattern regex to valid asian languages
- [TDQ-14001](https://jira.talendforge.org/browse/TDQ-14001) check all Locales for Date discovery
- [TDQ-15225](https://jira.talendforge.org/browse/TDQ-15225) remove [wORD] pattern and simplify patterns
- [TDQ-14987](https://jira.talendforge.org/browse/TDQ-14987) fix manifest following the date improvement
- [TDQ-14987](https://jira.talendforge.org/browse/TDQ-14987) improve date discovery
- [TDQ-15013](https://jira.talendforge.org/browse/TDQ-15013) remove deprecated methods

## [5.0.2] - 2018-04-04
## [5.0.1] - 2018-03-28
- [TDQ-14893](https://jira.talendforge.org/browse/TDQ-14893) add LFU cache for technical type discovery
- [TDQ-14894](https://jira.talendforge.org/browse/TDQ-14894) add Date Pattern filter

## [5.0.0] - 2018-02-12
## [4.0.1] - 2017-12-08
- [TDQ-14481](https://jira.talendforge.org/browse/TDQ-14481) multi tenant index
- [TDQ-14484](https://jira.talendforge.org/browse/TDQ-14484) broadcast dictionary to cluster
- [TDQ-14107](https://jira.talendforge.org/browse/TDQ-14107) technical type discovery
- [TDQ-14421](https://jira.talendforge.org/browse/TDQ-14421) validate datetime with strict resolver
- [TDQ-14367](https://jira.talendforge.org/browse/TDQ-14367) Support multi-tenant lucene index for on-premise apps

## [1.7.1] - 2017-09-11
## [1.7.0] - 2017-08-24
- [TDQ-13389](https://jira.talendforge.org/browse/TDQ-13389) CardinalityStatistics can now take an Object instead of a String
- [TDQ-13936](https://jira.talendforge.org/browse/TDQ-13936) Recognize dates when a String with eras
- [TDQ-13935](https://jira.talendforge.org/browse/TDQ-13935) sync 'DateRegexesGrouped.txt' in 'sampling' and 'statistics'
- [TDQ-13103](https://jira.talendforge.org/browse/TDQ-13103) update pattern to support percentages

## [1.6.3] - 2017-06-09
- [TDQ-13851](https://jira.talendforge.org/browse/TDQ-13851) support Date pattern "yyyy-MM-dd G"
- [TDQ-13347](https://jira.talendforge.org/browse/TDQ-13347) the value "5 TOTO 1999" must not be considered as a valid date
- [TDQ-13907](https://jira.talendforge.org/browse/TDQ-13907) fix the week based date pattern

## [1.6.2] - 2017-05-09
- [TDQ-13539](https://jira.talendforge.org/browse/TDQ-13539) add support for a new date pattern yyyy/M/d
- [TDQ-13369](https://jira.talendforge.org/browse/TDQ-13369) use more strict date patterns which do not allow padding zeroes for single M and/or d

## [1.6.1] - 2017-05-02
## [1.6.0] - 2017-04-07
- TDQ-13389: add the class AbstractCardinalityStatistics

## [1.5.6] - 2016-12-09
## [1.5.5] - 2016-12-02
## [1.5.4] - 2016-10-20
## [1.5.3] - 2016-09-28
## [1.5.2] - 2016-09-16
- [TDQ-12269](https://jira.talendforge.org/browse/TDQ-12269) code quality improvements

## [1.5.1] - 2016-06-27
- [TDQ-12047](https://jira.talendforge.org/browse/TDQ-12047) optimize category suggestion by prioritizing with ordinal information
- [TDQ-11678](https://jira.talendforge.org/browse/TDQ-11678) Improve analysis performance:
	 * improve SemanticQualityAnalyzer performance by skipping validity calculation on categories of OPEN_INDEX type
	 * remove NULL from the LAST_NAME dictionary
	 * improve performance by using a LRU cache for category recognition results
- [TDQ-12016](https://jira.talendforge.org/browse/TDQ-12016) [TDQ-12122](https://jira.talendforge.org/browse/TDQ-12122) fix numeric column masking issue
- [TDQ-11557](https://jira.talendforge.org/browse/TDQ-11557) add more date time patterns
- [TDQ-12016](https://jira.talendforge.org/browse/TDQ-12016) be able to mask dates outside the top 15 date patterns
- [TDQ-11557](https://jira.talendforge.org/browse/TDQ-11557) support the default output format of java.util.Date
- [TDQ-11557](https://jira.talendforge.org/browse/TDQ-11557) fix datetime regex generation issue with slashes
- [TDQ-11817](https://jira.talendforge.org/browse/TDQ-11817) add space in bigdecimal notation

## [1.5.0] - 2016-05-10
- rename artifact ID to dataquality-statistics

## [1.4.4] - 2016-04-27 (for Studio 6.2.0)
- [TDQ-11763](https://jira.talendforge.org/browse/TDQ-11763) support numbers with non-breaking spaces
- [TDQ-11833](https://jira.talendforge.org/browse/TDQ-11833) support more date patterns

## [1.4.3] - 2016-03-25
- [TDP-228](https://jira.talendforge.org/browse/TDP-228) fix incorrect data type guess
- [TDQ-11316](https://jira.talendforge.org/browse/TDQ-11316) add a category ANSWER for columns of mixed yes/no values

## [1.4.2] - 2016-01-26
- [TDQ-11557](https://jira.talendforge.org/browse/TDQ-11557) add more date and time patterns and different combinations
- [TDQ-11548](https://jira.talendforge.org/browse/TDQ-11548) improve regex of decimal value detection

## [1.4.1] - 2015-12-30
- move to data-quality repository, change parent pom
- performance improvement on GetAllPatterns by using grouped regexes
- remove patterns with single y for year part
- correct some regex generation rule to make it compatible with Java8 DateTimeFormatter API 

## [1.4.0] - 2015-12-17
- refactor date time pattern analyzers
- use generated pattern format list with regexes instead of the previous one
- add some additional common patterns

## [1.3.4] - 2015-12-10
- update to org.talend.dataquality.common 1.3.4

## [1.3.3] - 2015-11-23
- update dependencies following lucene4 upgrade in standardization library
- support custom date pattern in DatePatternAnalyzer and DataTypeQualityAnalyzer
- build the library as OSGI bundle

## [1.3.2] - 2015-10-29
- [TDQ-10903](https://jira.talendforge.org/browse/TDQ-10903) optimize dictionaries
- adjust OPEN/CLOSE type for some indexes

## [1.3.1] - 2015-10-22 (for Studio 6.1.0)
- [TDQ-10413](https://jira.talendforge.org/browse/TDQ-10413) compute list of invalid values according to semantic type
- [TDQ-10981](https://jira.talendforge.org/browse/TDQ-10981) concurrent analyzer
- [TDQ-10988](https://jira.talendforge.org/browse/TDQ-10988) latin1 supplement support in pattern statistics
