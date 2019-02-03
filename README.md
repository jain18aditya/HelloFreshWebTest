# HelloFreshWebTest
Framework Details:
1. Extended the fraework by adding new layer of Cucumber alongwith Junit which was already present.
2. Converted in to page object model where now all pages and page acion are on one place and action on pages are in Cucumber steps.
3. Tests are written in feature file in plain english language which can be easily understandable even to non automation person.
4. Removed Hardcoaded data and reading data from application.properties file.
5. Now you can select which browser to use for execution you need to pass the same in application.properties file.

Logging:
6. Used log4j for gathering logs and report file will be generated at root location.
7. Used hooks class of Cucumber to improve the logging.

Screenshot:
Framework takes snapshots if failed at any point.

Reports:
A very good Cucumber reports are generated under target folder

CI:
Can be easily linked with CI tool and if required all values can be passed through CI tool itself.

Run requirement:
1. Clone this project
2. Maven will download all the dependencies.
3. Run as either JUnit or Cucumber
4. Check reports.
