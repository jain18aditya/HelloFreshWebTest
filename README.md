# HelloFreshWebTest
Framework Details:
1. Extended the framework by adding new layer of Cucumber along with Junit which was already present.
2. Converted in to page object model where now all pages and page acion are on one place and action on pages(Background code for cucumber steps) are in Cucumber steps.
3. Tests are written in feature file in plain english language which can be easily understandable even to non automation person.
4. Removed Hardcoaded data and reading data from application.properties file.
5. Now you can select which browser to use for execution you need to pass the same in application.properties file.
6. "Maven surefire plugin" or "cucumber jvm parallel plugin" will run all the feature files in parallel but in this case only one feature file is present so for now it is of noot much use.

Logging:
7. Used log4j for gathering logs and log file will be generated at root location.
8. Used hooks class of Cucumber to improve the logging.

Screenshot:
9. Framework takes snapshots if failed at any point.

Reports:
10. A very good Cucumber reports are generated under target folder

CI:
11. Can be easily linked with CI tool and if required all values can be passed through CI tool itself.

# Run requirement:
1. Clone this project
2. Maven will download all the dependencies.
3. Run as either JUnit from runner file or Cucumber feature file.
4. Check reports.