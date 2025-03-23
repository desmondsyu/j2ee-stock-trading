Clone the Repository
```
git clone <repository-url>
cd StockTradingSystem
```

Build the project using Maven
```
mvn clean install
```

Start WildFly
```
/usr/local/opt/wildfly-as/libexec/bin/standalone.sh --server-config=standalone-full.xml

```

Deploy the Application

Access Web UI
```
http://localhost:8080
```
