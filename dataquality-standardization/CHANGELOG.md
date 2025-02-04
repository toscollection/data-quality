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
### Security
- fix([TDQ-20851](https://jira.talendforge.org/browse/TDQ-20851)): Upgrade slf4j to 1.7.34

## [9.1.10] - 2022-11-10

## [9.1.9] - 2022-10-13

## [9.1.8] - 2022-09-15
### Security
- fix([TDQ-20633](https://jira.talendforge.org/browse/TDQ-20633)): upgrade 'lucene-core' to 8.11.2

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
### Changed
- fix([TUP-32162](https://jira.talendforge.org/browse/TUP-32162)): Remove all the nl plugins for Talend translations
### Security
- fix([TDQ-19311](https://jira.talendforge.org/browse/TDQ-19311)): Fix Apache Commons IO issues (to 2.8.0)

## [9.0.0] - 2021-06-02
### Security
- fix([TDQ-19073](https://jira.talendforge.org/browse/TDQ-19073)): Fix JUnit issue

## [8.3.1] - 2020-11-18

## [8.3.0] - 2020-07-16

## [8.2.0] - 2020-06-18
### Fixed
- chore([TDQ-18091](https://jira.talendforge.org/browse/TDQ-18091)) more clear error message.

## [8.1.0] - 2020-03-13

## [8.0.0] - 2020-02-03
### Added
- chore([TDQ-17710](https://jira.talendforge.org/browse/TDQ-17710)): Adopt the "Keep a Changelog" format for changelogs
### Changed
- feat([TDQ-17504](https://jira.talendforge.org/browse/TDQ-17504)): upgrade to lucene 8 in standardization library for studio
### Removed
- chore([TDQ-17788](https://jira.talendforge.org/browse/TDQ-17788)): remove unused AllDQStandardizationTests class

## [v6.0.0] - 2018-07-03
- [TDQ-15012](https://jira.talendforge.org/browse/TDQ-15012) add dependencies in manifest
- [TDQ-14221](https://jira.talendforge.org/browse/TDQ-14221) update google libphonenumber and log to info
- [TDQ-14221](https://jira.talendforge.org/browse/TDQ-14221) extract informations for an international phone number
- [TDQ-11891](https://jira.talendforge.org/browse/TDQ-11891) extract phone informations
- [TDQ-15013](https://jira.talendforge.org/browse/TDQ-15013) remove deprecated methods
- [TDQ-15013](https://jira.talendforge.org/browse/TDQ-15013) remove csv and main packages in standardization project

## [5.0.2] - 2018-04-04
## [5.0.1] - 2018-03-28
## [5.0.0] - 2018-02-12
## [4.0.1] - 2017-12-08
- [TDQ-14481](https://jira.talendforge.org/browse/TDQ-14481) multi tenant index

## [3.4.1] - 2017-09-11
## [3.4.0] - 2017-08-24
- [TDQ-12953](https://jira.talendforge.org/browse/TDQ-12953) improve FirstNameStandardize class to get an accurate result.
- [TDQ-14152](https://jira.talendforge.org/browse/TDQ-14152) [TDQ-14236](https://jira.talendforge.org/browse/TDQ-14236) upgrade libphonenumber related jars.

## [3.3.3] - 2017-06-09
## [3.3.2] - 2017-05-09
## [3.3.1] - 2017-05-02
## [3.3.0] - 2017-04-07
- [TDQ-13066](https://jira.talendforge.org/browse/TDQ-13066) SynonymIndexBuilder.getDocument() should always return live records

## [3.2.6] - 2016-12-09
## [3.2.5] - 2016-12-02
## [3.2.4] - 2016-10-20
- [TDQ-12143](https://jira.talendforge.org/browse/TDQ-12143) make classes Serializable to support tSynonymSearch on spark

## [3.2.3] - 2016-09-28
- [TDQ-12143](https://jira.talendforge.org/browse/TDQ-12143) change org.talend.dataquality.standardization.index.Error class to Serializable to support tSynonymSearch on spark

## [3.2.2] - 2016-09-16
- move semantic dictionary search API to dataquality-semantic library

## [3.2.1] - 2016-06-27 (with DQ library release 1.5.1)
## [3.2.0] - 2016-05-10
- rename artifact ID to dataquality-standardization

## [3.1.0] - 2016-4-27 (for Studio 6.2.0)
- [TDQ-11701](https://jira.talendforge.org/browse/TDQ-11701) Lucene Index issues 
				* use searcher manager to handle concurrent index access
				* release file handles correctly
				* Removes non-needed dependency on sampling in semantic module.
				* Reuses previously extracted files when found iso. traversing source JAR again and again.
- [TDQ-11440](https://jira.talendforge.org/browse/TDQ-11440) Add google phone number API.Create an API to validate, format, enrich phone information

## [3.0.2] - 2015-12-30
- move to data-quality repository, change parent pom

## [3.0.1] - 2015-11-23
- build standardazation library with new Maven mechanism
- set default maxEdits parameter to 1 instead of 2
- improvements about index matching([TDQ-11143](https://jira.talendforge.org/browse/TDQ-11143)):
- make method getTokensFromAnalyzer() public static and stripping accents
- add 2 new search modes: MATCH_SEMANTIC_DICTIONARY and MATCH_SEMANTIC_KEYWORD
- [TDQ-11296](https://jira.talendforge.org/browse/TDQ-11296) limit the token count for semantic queries to avoid lucene error

## [3.0.0] - 2015-10-28
- upgrade lucene library to 4.10.4

## [2.5.0] - 2013-09-05 (for V5.4)
- add 6 search modes for synonym library: MATCH_ANY MATCH_PARTIAL MATCH_ALL MATCH_EXACT MATCH_ANY_FUZZY MATCH_ALL_FUZZY
- add Matching Threshold option in SynonymIndexSearcher

## [2.0.2] - 2012-07-17 
- correct some issues to improve match results of tFirstnameMatch ([TDQ-1576](https://jira.talendforge.org/browse/TDQ-1576)) :  
    -  for standard mode, removed the doc collector and augmented the similarity 
    -  for fuzzy mode, lowercase the word to assure the prefix is identical to indexed words 

## [2.0.1] - 2012-03-15
- Move boost changes from SynonymIndexBuilder to SynonymIndexSearcher, so that we can
  change the boost values without regeneration of the indexes "out of the box".

## [2.0.0] - 2012-03-06
- improvements for better scoring with combined query across multiple fields. (related to [TDQ-3606](https://jira.talendforge.org/browse/TDQ-3606))
- do not filter English stop words any more during indexing. (related to [TDQ-3330](https://jira.talendforge.org/browse/TDQ-3330))
- added IndexMigrator to regenerate out-of-the-box indexes.

## [1.5.19] - 2011-11-23
- check folder before delete when "initialize" option is chosen in tSynonymOutput component.

## [1.5.18] - 2011-05-23
- moved Explainer class to test project.
- included missing Messages classes in the jar.
- added missing trim() when referencing document in update and delete method.

## [1.5.17] - 2011-05-19
- added missed trim() for F_WORD during index creation.
- added Explainer class of lucene scoring.  

## [1.5.16] - 2011-04-15
- change word value of empty record from "" to null
- remove first character '|' of scores
- if input value is empty, create an empty record

## [1.5.15]]
- in previous version, the score is not 0 when a field is not match. Hence, a nbMatch field is added to the Output record. 

## [1.5.14]
- SynonymRecordSearch returns a result even when nothing is found. (score is 0 of course). 

## [1.5.13]
- added some other junit tests for new implementation of computeRows
- changed output contents for DOCUMENT_MATCHED

## [1.5.12]
- review implementation of computeRows and add new junit tests.
 
## [1.5.11]
- added trim() before inserting synonyms into index.
- fixed a bug in SynonymRecordSearcher when result counts of different columns have factorization.
- when several documents are matched, set the return value to -1 to avoid insertion by the component (when nbUpdatedDocuments == 0).

## [1.5.10]
- missing classes added to file.

## [1.5.9]
- added information for execution error caused by no segments file
- corrected some user information
- removed the deprecated method setMode()

## [1.5.8]
- code cleansing + javadoc added

## [1.5.7]
- avoid SynonymRecordSearcher to return duplicates
- removed the limit[] argument from the SynonymRecordSearcher.search method

## [1.5.6]
- add method close after utilisations of SynonymIndexSearcher.
- fixed delete index from file system


## [1.5.5]
- setMode marked as deprecated method (not useful)
- avoid NPE when some synonyms are nulls
- avoid to commit each time we delete a document
- refactor OutputRecord in its own file + add accessors
- search API throws exceptions that can be caught by the component

## [1.5.4]
- limit the number of returned results

## [1.5.3]
- optimize synonym index builder and searcher

## [1.5.2]
- add support to create index path
- add support to return error messages

## [1.5.1]
- update java doc of deleteDocumentByWord process
- modified insertDocument process,
- remove a clause and change to commit the document immediately
- add java doc for closeIndex process

