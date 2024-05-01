###### <h1 style="text-align: center;"> Digital Currency Controller <img src="https://em-content.zobj.net/source/apple/391/currency-exchange_1f4b1.png" width="35"/> </h1>

<h2>Project Description:</h2>
<p>
The <b>Digital Currency Controller</b> app is a Java-based web application that serves as a simple controller to provide real-time prices for cryptocurrency pairs. It utilizes Spring Boot to handle incoming requests and fetches current prices asynchronously from an external API.
</p>

<h2>Project Structure:</h2>
<ul>
  <li>
    <strong>Controller:</strong>
    <p>The <code>DigitalCurrencyController</code> handles incoming requests and returns the current price for the specified cryptocurrency pair.</p>
  </li>
  <li>
    <strong>Service:</strong>
    <p>The <code>DigitalCurrencyServiceImpl</code> implements the business logic for fetching and storing cryptocurrency prices asynchronously using Spring's scheduling capabilities.</p>
  </li>
  <li>
    <strong>External API:</strong>
    <p>The application fetches cryptocurrency prices from the Binance API using the <code>RestTemplate</code> provided by Spring.</p>
  </li>
</ul>


<h2>Key Features:</h2>
<ol>
  <li>
    <strong>Real-Time Prices:</strong>
    <p>The application fetches and provides real-time prices for cryptocurrency pairs from the Binance API.</p>
  </li>
  <li>
    <strong>Asynchronous Data Fetching:</strong>
    <p>Cryptocurrency prices are fetched asynchronously to prevent blocking the application's main thread and ensure responsiveness.</p>
  </li>
  <li>
    <strong>Dynamic Endpoint:</strong>
    <p>The endpoint for retrieving cryptocurrency prices is customizable, allowing users to specify the cryptocurrency pair of interest.</p>
  </li>
</ol>

<h2>Technologies:</h2>
<ul>
  <li>
    <img style="width: 25px; height: 25px; object-fit: cover;" src="assets/java.png"/> 
    <b>Java</b>
  </li>
  <li>
    <img style="width: 25px; height: 25px; object-fit: cover;" src="assets/spring.png"/> 
    <b>Spring Boot</b>
  </li>
  <li>
    <img style="width: 25px; height: 25px; object-fit: cover;" src="assets/spring.png"/> 
    <b>Spring Web</b>
  </li>
  <li>
    <img style="width: 25px; height: 25px; object-fit: cover;" src="assets/binance.png"/> 
    <b>Binance API</b>
  </li>
  <li>
    <img style="width: 25px; height: 25px; object-fit: cover;" src="assets/swagger.png"/> 
    <b>Swagger</b>
  </li>
  <li>
    <img style="width: 25px; height: 25px; object-fit: cover;" src="assets/lombok.png"/> 
    <b>Lombok</b>
  </li>
</ul>

<h5>Description:</h5>
<ol>
  <li>The project is built using Java with Spring Boot, providing a lightweight and efficient solution for serving cryptocurrency prices.</li>
  <li>Spring's scheduling capabilities are leveraged to fetch cryptocurrency prices asynchronously at regular intervals.</li>
  <li>The application communicates with the Binance API to retrieve real-time cryptocurrency prices for specified pairs.</li>
</ol>

<h2> Swagger Documentation <img src="assets/swagger.png" width="25"/> </h2>
API requests are documented using Swagger.
You can access the Swagger UI to explore and test the API endpoints by navigating to:
<code>http://localhost:8080/swagger-ui/index.html#/</code>
