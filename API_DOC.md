---
title: TCC SGCO - API v1.0
language_tabs:
  - shell: Shell
  - http: HTTP
  - java: Java
toc_footers: []
includes: []
search: true
highlight_theme: darkula
headingLevel: 2

---

<!-- Generator: Widdershins v4.0.1 -->

<h1 id="tcc-sgco-api">TCC SGCO - API v1.0</h1>

> Scroll down for code samples, example requests and responses. Select a language for code samples from the tabs above or the mobile navigation menu.

Documentação da API

Base URLs:

* <a href="http://localhost:8080">http://localhost:8080</a>

<h1 id="tcc-sgco-api-operador-controller">operador-controller</h1>

## getUserById_1

<a id="opIdgetUserById_1"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/v1/operador/users/{id} \
  -H 'Accept: */*'

```

```http
GET http://localhost:8080/v1/operador/users/{id} HTTP/1.1
Host: localhost:8080
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/operador/users/{id}',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.get 'http://localhost:8080/v1/operador/users/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.get('http://localhost:8080/v1/operador/users/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/v1/operador/users/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/operador/users/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/v1/operador/users/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /v1/operador/users/{id}`

<h3 id="getuserbyid_1-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|

> Example responses

> 200 Response

<h3 id="getuserbyid_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Usuario](#schemausuario)|

<aside class="success">
This operation does not require authentication
</aside>

## updateUser

<a id="opIdupdateUser"></a>

> Code samples

```shell
# You can also use wget
curl -X PUT http://localhost:8080/v1/operador/users/{id} \
  -H 'Content-Type: application/json' \
  -H 'Accept: */*'

```

```http
PUT http://localhost:8080/v1/operador/users/{id} HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: */*

```

```javascript
const inputBody = '{
  "empty": true,
  "property1": {},
  "property2": {}
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/operador/users/{id}',
{
  method: 'PUT',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => '*/*'
}

result = RestClient.put 'http://localhost:8080/v1/operador/users/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': '*/*'
}

r = requests.put('http://localhost:8080/v1/operador/users/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('PUT','http://localhost:8080/v1/operador/users/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/operador/users/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("PUT");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("PUT", "http://localhost:8080/v1/operador/users/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`PUT /v1/operador/users/{id}`

> Body parameter

```json
{
  "empty": true,
  "property1": {},
  "property2": {}
}
```

<h3 id="updateuser-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|
|body|body|[JSONObject](#schemajsonobject)|true|none|

> Example responses

> 200 Response

<h3 id="updateuser-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="updateuser-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## getConsultaById

<a id="opIdgetConsultaById"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/v1/operador/consultas/{id} \
  -H 'Accept: */*'

```

```http
GET http://localhost:8080/v1/operador/consultas/{id} HTTP/1.1
Host: localhost:8080
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/operador/consultas/{id}',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.get 'http://localhost:8080/v1/operador/consultas/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.get('http://localhost:8080/v1/operador/consultas/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/v1/operador/consultas/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/operador/consultas/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/v1/operador/consultas/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /v1/operador/consultas/{id}`

<h3 id="getconsultabyid-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|

> Example responses

> 200 Response

<h3 id="getconsultabyid-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Consulta](#schemaconsulta)|

<aside class="success">
This operation does not require authentication
</aside>

## updateConsulta

<a id="opIdupdateConsulta"></a>

> Code samples

```shell
# You can also use wget
curl -X PUT http://localhost:8080/v1/operador/consultas/{id} \
  -H 'Content-Type: application/json' \
  -H 'Accept: */*'

```

```http
PUT http://localhost:8080/v1/operador/consultas/{id} HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: */*

```

```javascript
const inputBody = '{
  "id": 0,
  "data": "2019-08-24T14:15:22Z",
  "pacientes": [
    {
      "id": 0,
      "nome": "string",
      "senha": "string",
      "status": true,
      "tipoUsuario": "string",
      "dadoUsuario": {
        "id": 0,
        "dataNascimento": "2019-08-24T14:15:22Z",
        "cpf": "string",
        "sexo": "string",
        "celular": "string",
        "telefone": "string",
        "email": "string",
        "estadoCivil": "string"
      },
      "endereco": {
        "id": 0,
        "cep": "string",
        "logradouro": "string",
        "numero": 0,
        "complemento": "string",
        "referencia": "string",
        "bairro": "string",
        "municipio": "string",
        "estado": "string",
        "pais": "string"
      },
      "consultas": [
        {
          "id": 0,
          "data": "2019-08-24T14:15:22Z",
          "pacientes": [],
          "observacao": "string"
        }
      ]
    }
  ],
  "observacao": "string"
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/operador/consultas/{id}',
{
  method: 'PUT',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => '*/*'
}

result = RestClient.put 'http://localhost:8080/v1/operador/consultas/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': '*/*'
}

r = requests.put('http://localhost:8080/v1/operador/consultas/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('PUT','http://localhost:8080/v1/operador/consultas/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/operador/consultas/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("PUT");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("PUT", "http://localhost:8080/v1/operador/consultas/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`PUT /v1/operador/consultas/{id}`

> Body parameter

```json
{
  "id": 0,
  "data": "2019-08-24T14:15:22Z",
  "pacientes": [
    {
      "id": 0,
      "nome": "string",
      "senha": "string",
      "status": true,
      "tipoUsuario": "string",
      "dadoUsuario": {
        "id": 0,
        "dataNascimento": "2019-08-24T14:15:22Z",
        "cpf": "string",
        "sexo": "string",
        "celular": "string",
        "telefone": "string",
        "email": "string",
        "estadoCivil": "string"
      },
      "endereco": {
        "id": 0,
        "cep": "string",
        "logradouro": "string",
        "numero": 0,
        "complemento": "string",
        "referencia": "string",
        "bairro": "string",
        "municipio": "string",
        "estado": "string",
        "pais": "string"
      },
      "consultas": [
        {
          "id": 0,
          "data": "2019-08-24T14:15:22Z",
          "pacientes": [],
          "observacao": "string"
        }
      ]
    }
  ],
  "observacao": "string"
}
```

<h3 id="updateconsulta-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|
|body|body|[Consulta](#schemaconsulta)|true|none|

> Example responses

> 200 Response

<h3 id="updateconsulta-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Consulta](#schemaconsulta)|

<aside class="success">
This operation does not require authentication
</aside>

## getUsers

<a id="opIdgetUsers"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/v1/operador/users \
  -H 'Accept: */*'

```

```http
GET http://localhost:8080/v1/operador/users HTTP/1.1
Host: localhost:8080
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/operador/users',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.get 'http://localhost:8080/v1/operador/users',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.get('http://localhost:8080/v1/operador/users', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/v1/operador/users', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/operador/users");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/v1/operador/users", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /v1/operador/users`

> Example responses

> 200 Response

<h3 id="getusers-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="getusers-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[[Usuario](#schemausuario)]|false|none|none|
|» id|integer(int32)|false|none|none|
|» nome|string|true|none|none|
|» senha|string|true|none|none|
|» status|boolean|false|none|none|
|» tipoUsuario|string|false|none|none|
|» dadoUsuario|[DadoUsuario](#schemadadousuario)|false|none|none|
|»» id|integer(int32)|false|none|none|
|»» dataNascimento|string(date-time)|false|none|none|
|»» cpf|string|false|none|none|
|»» sexo|string|false|none|none|
|»» celular|string|false|none|none|
|»» telefone|string|false|none|none|
|»» email|string|false|none|none|
|»» estadoCivil|string|false|none|none|
|» endereco|[Endereco](#schemaendereco)|false|none|none|
|»» id|integer(int32)|false|none|none|
|»» cep|string|false|none|none|
|»» logradouro|string|false|none|none|
|»» numero|integer(int32)|false|none|none|
|»» complemento|string|false|none|none|
|»» referencia|string|false|none|none|
|»» bairro|string|false|none|none|
|»» municipio|string|false|none|none|
|»» estado|string|false|none|none|
|»» pais|string|false|none|none|
|» consultas|[[Consulta](#schemaconsulta)]|false|none|none|
|»» id|integer(int32)|false|none|none|
|»» data|string(date-time)|false|none|none|
|»» pacientes|[[Usuario](#schemausuario)]|false|none|none|
|»» observacao|string|false|none|none|

<aside class="success">
This operation does not require authentication
</aside>

## creatUser

<a id="opIdcreatUser"></a>

> Code samples

```shell
# You can also use wget
curl -X POST http://localhost:8080/v1/operador/users \
  -H 'Content-Type: application/json' \
  -H 'Accept: */*'

```

```http
POST http://localhost:8080/v1/operador/users HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: */*

```

```javascript
const inputBody = '{
  "id": 0,
  "nome": "string",
  "senha": "string",
  "status": true,
  "tipoUsuario": "string",
  "dadoUsuario": {
    "id": 0,
    "dataNascimento": "2019-08-24T14:15:22Z",
    "cpf": "string",
    "sexo": "string",
    "celular": "string",
    "telefone": "string",
    "email": "string",
    "estadoCivil": "string"
  },
  "endereco": {
    "id": 0,
    "cep": "string",
    "logradouro": "string",
    "numero": 0,
    "complemento": "string",
    "referencia": "string",
    "bairro": "string",
    "municipio": "string",
    "estado": "string",
    "pais": "string"
  },
  "consultas": [
    {
      "id": 0,
      "data": "2019-08-24T14:15:22Z",
      "pacientes": [
        {
          "id": 0,
          "nome": "string",
          "senha": "string",
          "status": true,
          "tipoUsuario": "string",
          "dadoUsuario": {
            "id": 0,
            "dataNascimento": "2019-08-24T14:15:22Z",
            "cpf": "string",
            "sexo": "string",
            "celular": "string",
            "telefone": "string",
            "email": "string",
            "estadoCivil": "string"
          },
          "endereco": {
            "id": 0,
            "cep": "string",
            "logradouro": "string",
            "numero": 0,
            "complemento": "string",
            "referencia": "string",
            "bairro": "string",
            "municipio": "string",
            "estado": "string",
            "pais": "string"
          },
          "consultas": []
        }
      ],
      "observacao": "string"
    }
  ]
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/operador/users',
{
  method: 'POST',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => '*/*'
}

result = RestClient.post 'http://localhost:8080/v1/operador/users',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': '*/*'
}

r = requests.post('http://localhost:8080/v1/operador/users', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('POST','http://localhost:8080/v1/operador/users', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/operador/users");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("POST");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("POST", "http://localhost:8080/v1/operador/users", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`POST /v1/operador/users`

> Body parameter

```json
{
  "id": 0,
  "nome": "string",
  "senha": "string",
  "status": true,
  "tipoUsuario": "string",
  "dadoUsuario": {
    "id": 0,
    "dataNascimento": "2019-08-24T14:15:22Z",
    "cpf": "string",
    "sexo": "string",
    "celular": "string",
    "telefone": "string",
    "email": "string",
    "estadoCivil": "string"
  },
  "endereco": {
    "id": 0,
    "cep": "string",
    "logradouro": "string",
    "numero": 0,
    "complemento": "string",
    "referencia": "string",
    "bairro": "string",
    "municipio": "string",
    "estado": "string",
    "pais": "string"
  },
  "consultas": [
    {
      "id": 0,
      "data": "2019-08-24T14:15:22Z",
      "pacientes": [
        {
          "id": 0,
          "nome": "string",
          "senha": "string",
          "status": true,
          "tipoUsuario": "string",
          "dadoUsuario": {
            "id": 0,
            "dataNascimento": "2019-08-24T14:15:22Z",
            "cpf": "string",
            "sexo": "string",
            "celular": "string",
            "telefone": "string",
            "email": "string",
            "estadoCivil": "string"
          },
          "endereco": {
            "id": 0,
            "cep": "string",
            "logradouro": "string",
            "numero": 0,
            "complemento": "string",
            "referencia": "string",
            "bairro": "string",
            "municipio": "string",
            "estado": "string",
            "pais": "string"
          },
          "consultas": []
        }
      ],
      "observacao": "string"
    }
  ]
}
```

<h3 id="creatuser-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[Usuario](#schemausuario)|true|none|

> Example responses

> 200 Response

<h3 id="creatuser-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Usuario](#schemausuario)|

<aside class="success">
This operation does not require authentication
</aside>

## getConsultas

<a id="opIdgetConsultas"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/v1/operador/consultas \
  -H 'Accept: */*'

```

```http
GET http://localhost:8080/v1/operador/consultas HTTP/1.1
Host: localhost:8080
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/operador/consultas',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.get 'http://localhost:8080/v1/operador/consultas',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.get('http://localhost:8080/v1/operador/consultas', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/v1/operador/consultas', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/operador/consultas");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/v1/operador/consultas", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /v1/operador/consultas`

> Example responses

> 200 Response

<h3 id="getconsultas-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="getconsultas-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[[Consulta](#schemaconsulta)]|false|none|none|
|» id|integer(int32)|false|none|none|
|» data|string(date-time)|false|none|none|
|» pacientes|[[Usuario](#schemausuario)]|false|none|none|
|»» id|integer(int32)|false|none|none|
|»» nome|string|true|none|none|
|»» senha|string|true|none|none|
|»» status|boolean|false|none|none|
|»» tipoUsuario|string|false|none|none|
|»» dadoUsuario|[DadoUsuario](#schemadadousuario)|false|none|none|
|»»» id|integer(int32)|false|none|none|
|»»» dataNascimento|string(date-time)|false|none|none|
|»»» cpf|string|false|none|none|
|»»» sexo|string|false|none|none|
|»»» celular|string|false|none|none|
|»»» telefone|string|false|none|none|
|»»» email|string|false|none|none|
|»»» estadoCivil|string|false|none|none|
|»» endereco|[Endereco](#schemaendereco)|false|none|none|
|»»» id|integer(int32)|false|none|none|
|»»» cep|string|false|none|none|
|»»» logradouro|string|false|none|none|
|»»» numero|integer(int32)|false|none|none|
|»»» complemento|string|false|none|none|
|»»» referencia|string|false|none|none|
|»»» bairro|string|false|none|none|
|»»» municipio|string|false|none|none|
|»»» estado|string|false|none|none|
|»»» pais|string|false|none|none|
|»» consultas|[[Consulta](#schemaconsulta)]|false|none|none|
|» observacao|string|false|none|none|

<aside class="success">
This operation does not require authentication
</aside>

## criarConsulta

<a id="opIdcriarConsulta"></a>

> Code samples

```shell
# You can also use wget
curl -X POST http://localhost:8080/v1/operador/consultas \
  -H 'Content-Type: application/json' \
  -H 'Accept: */*'

```

```http
POST http://localhost:8080/v1/operador/consultas HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: */*

```

```javascript
const inputBody = '{
  "id": 0,
  "data": "2019-08-24T14:15:22Z",
  "pacientes": [
    {
      "id": 0,
      "nome": "string",
      "senha": "string",
      "status": true,
      "tipoUsuario": "string",
      "dadoUsuario": {
        "id": 0,
        "dataNascimento": "2019-08-24T14:15:22Z",
        "cpf": "string",
        "sexo": "string",
        "celular": "string",
        "telefone": "string",
        "email": "string",
        "estadoCivil": "string"
      },
      "endereco": {
        "id": 0,
        "cep": "string",
        "logradouro": "string",
        "numero": 0,
        "complemento": "string",
        "referencia": "string",
        "bairro": "string",
        "municipio": "string",
        "estado": "string",
        "pais": "string"
      },
      "consultas": [
        {
          "id": 0,
          "data": "2019-08-24T14:15:22Z",
          "pacientes": [],
          "observacao": "string"
        }
      ]
    }
  ],
  "observacao": "string"
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/operador/consultas',
{
  method: 'POST',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => '*/*'
}

result = RestClient.post 'http://localhost:8080/v1/operador/consultas',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': '*/*'
}

r = requests.post('http://localhost:8080/v1/operador/consultas', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('POST','http://localhost:8080/v1/operador/consultas', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/operador/consultas");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("POST");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("POST", "http://localhost:8080/v1/operador/consultas", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`POST /v1/operador/consultas`

> Body parameter

```json
{
  "id": 0,
  "data": "2019-08-24T14:15:22Z",
  "pacientes": [
    {
      "id": 0,
      "nome": "string",
      "senha": "string",
      "status": true,
      "tipoUsuario": "string",
      "dadoUsuario": {
        "id": 0,
        "dataNascimento": "2019-08-24T14:15:22Z",
        "cpf": "string",
        "sexo": "string",
        "celular": "string",
        "telefone": "string",
        "email": "string",
        "estadoCivil": "string"
      },
      "endereco": {
        "id": 0,
        "cep": "string",
        "logradouro": "string",
        "numero": 0,
        "complemento": "string",
        "referencia": "string",
        "bairro": "string",
        "municipio": "string",
        "estado": "string",
        "pais": "string"
      },
      "consultas": [
        {
          "id": 0,
          "data": "2019-08-24T14:15:22Z",
          "pacientes": [],
          "observacao": "string"
        }
      ]
    }
  ],
  "observacao": "string"
}
```

<h3 id="criarconsulta-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[Consulta](#schemaconsulta)|true|none|

> Example responses

> 200 Response

<h3 id="criarconsulta-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Consulta](#schemaconsulta)|

<aside class="success">
This operation does not require authentication
</aside>

<h1 id="tcc-sgco-api-admin-controlle">admin-controlle</h1>

## getUserById_2

<a id="opIdgetUserById_2"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/v1/admin/users/{id} \
  -H 'Accept: */*'

```

```http
GET http://localhost:8080/v1/admin/users/{id} HTTP/1.1
Host: localhost:8080
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/admin/users/{id}',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.get 'http://localhost:8080/v1/admin/users/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.get('http://localhost:8080/v1/admin/users/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/v1/admin/users/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/admin/users/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/v1/admin/users/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /v1/admin/users/{id}`

<h3 id="getuserbyid_2-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|

> Example responses

> 200 Response

<h3 id="getuserbyid_2-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Usuario](#schemausuario)|

<aside class="success">
This operation does not require authentication
</aside>

## updateUser_1

<a id="opIdupdateUser_1"></a>

> Code samples

```shell
# You can also use wget
curl -X PUT http://localhost:8080/v1/admin/users/{id} \
  -H 'Content-Type: application/json' \
  -H 'Accept: */*'

```

```http
PUT http://localhost:8080/v1/admin/users/{id} HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: */*

```

```javascript
const inputBody = '{
  "empty": true,
  "property1": {},
  "property2": {}
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/admin/users/{id}',
{
  method: 'PUT',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => '*/*'
}

result = RestClient.put 'http://localhost:8080/v1/admin/users/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': '*/*'
}

r = requests.put('http://localhost:8080/v1/admin/users/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('PUT','http://localhost:8080/v1/admin/users/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/admin/users/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("PUT");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("PUT", "http://localhost:8080/v1/admin/users/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`PUT /v1/admin/users/{id}`

> Body parameter

```json
{
  "empty": true,
  "property1": {},
  "property2": {}
}
```

<h3 id="updateuser_1-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|
|body|body|[JSONObject](#schemajsonobject)|true|none|

> Example responses

> 200 Response

<h3 id="updateuser_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="updateuser_1-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## deleteUser

<a id="opIddeleteUser"></a>

> Code samples

```shell
# You can also use wget
curl -X DELETE http://localhost:8080/v1/admin/users/{id} \
  -H 'Accept: */*'

```

```http
DELETE http://localhost:8080/v1/admin/users/{id} HTTP/1.1
Host: localhost:8080
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/admin/users/{id}',
{
  method: 'DELETE',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.delete 'http://localhost:8080/v1/admin/users/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.delete('http://localhost:8080/v1/admin/users/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('DELETE','http://localhost:8080/v1/admin/users/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/admin/users/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("DELETE");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("DELETE", "http://localhost:8080/v1/admin/users/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`DELETE /v1/admin/users/{id}`

<h3 id="deleteuser-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|

> Example responses

> 200 Response

<h3 id="deleteuser-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="deleteuser-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## getConsultaById_2

<a id="opIdgetConsultaById_2"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/v1/admin/consultas/{id} \
  -H 'Accept: */*'

```

```http
GET http://localhost:8080/v1/admin/consultas/{id} HTTP/1.1
Host: localhost:8080
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/admin/consultas/{id}',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.get 'http://localhost:8080/v1/admin/consultas/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.get('http://localhost:8080/v1/admin/consultas/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/v1/admin/consultas/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/admin/consultas/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/v1/admin/consultas/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /v1/admin/consultas/{id}`

<h3 id="getconsultabyid_2-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|

> Example responses

> 200 Response

<h3 id="getconsultabyid_2-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Consulta](#schemaconsulta)|

<aside class="success">
This operation does not require authentication
</aside>

## updateConsulta_1

<a id="opIdupdateConsulta_1"></a>

> Code samples

```shell
# You can also use wget
curl -X PUT http://localhost:8080/v1/admin/consultas/{id} \
  -H 'Content-Type: application/json' \
  -H 'Accept: */*'

```

```http
PUT http://localhost:8080/v1/admin/consultas/{id} HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: */*

```

```javascript
const inputBody = '{
  "id": 0,
  "data": "2019-08-24T14:15:22Z",
  "pacientes": [
    {
      "id": 0,
      "nome": "string",
      "senha": "string",
      "status": true,
      "tipoUsuario": "string",
      "dadoUsuario": {
        "id": 0,
        "dataNascimento": "2019-08-24T14:15:22Z",
        "cpf": "string",
        "sexo": "string",
        "celular": "string",
        "telefone": "string",
        "email": "string",
        "estadoCivil": "string"
      },
      "endereco": {
        "id": 0,
        "cep": "string",
        "logradouro": "string",
        "numero": 0,
        "complemento": "string",
        "referencia": "string",
        "bairro": "string",
        "municipio": "string",
        "estado": "string",
        "pais": "string"
      },
      "consultas": [
        {
          "id": 0,
          "data": "2019-08-24T14:15:22Z",
          "pacientes": [],
          "observacao": "string"
        }
      ]
    }
  ],
  "observacao": "string"
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/admin/consultas/{id}',
{
  method: 'PUT',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => '*/*'
}

result = RestClient.put 'http://localhost:8080/v1/admin/consultas/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': '*/*'
}

r = requests.put('http://localhost:8080/v1/admin/consultas/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('PUT','http://localhost:8080/v1/admin/consultas/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/admin/consultas/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("PUT");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("PUT", "http://localhost:8080/v1/admin/consultas/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`PUT /v1/admin/consultas/{id}`

> Body parameter

```json
{
  "id": 0,
  "data": "2019-08-24T14:15:22Z",
  "pacientes": [
    {
      "id": 0,
      "nome": "string",
      "senha": "string",
      "status": true,
      "tipoUsuario": "string",
      "dadoUsuario": {
        "id": 0,
        "dataNascimento": "2019-08-24T14:15:22Z",
        "cpf": "string",
        "sexo": "string",
        "celular": "string",
        "telefone": "string",
        "email": "string",
        "estadoCivil": "string"
      },
      "endereco": {
        "id": 0,
        "cep": "string",
        "logradouro": "string",
        "numero": 0,
        "complemento": "string",
        "referencia": "string",
        "bairro": "string",
        "municipio": "string",
        "estado": "string",
        "pais": "string"
      },
      "consultas": [
        {
          "id": 0,
          "data": "2019-08-24T14:15:22Z",
          "pacientes": [],
          "observacao": "string"
        }
      ]
    }
  ],
  "observacao": "string"
}
```

<h3 id="updateconsulta_1-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|
|body|body|[Consulta](#schemaconsulta)|true|none|

> Example responses

> 200 Response

<h3 id="updateconsulta_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Consulta](#schemaconsulta)|

<aside class="success">
This operation does not require authentication
</aside>

## deleteConsulta

<a id="opIddeleteConsulta"></a>

> Code samples

```shell
# You can also use wget
curl -X DELETE http://localhost:8080/v1/admin/consultas/{id} \
  -H 'Accept: */*'

```

```http
DELETE http://localhost:8080/v1/admin/consultas/{id} HTTP/1.1
Host: localhost:8080
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/admin/consultas/{id}',
{
  method: 'DELETE',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.delete 'http://localhost:8080/v1/admin/consultas/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.delete('http://localhost:8080/v1/admin/consultas/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('DELETE','http://localhost:8080/v1/admin/consultas/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/admin/consultas/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("DELETE");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("DELETE", "http://localhost:8080/v1/admin/consultas/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`DELETE /v1/admin/consultas/{id}`

<h3 id="deleteconsulta-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|

> Example responses

> 200 Response

<h3 id="deleteconsulta-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="deleteconsulta-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## getUsers_1

<a id="opIdgetUsers_1"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/v1/admin/users \
  -H 'Accept: */*'

```

```http
GET http://localhost:8080/v1/admin/users HTTP/1.1
Host: localhost:8080
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/admin/users',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.get 'http://localhost:8080/v1/admin/users',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.get('http://localhost:8080/v1/admin/users', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/v1/admin/users', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/admin/users");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/v1/admin/users", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /v1/admin/users`

> Example responses

> 200 Response

<h3 id="getusers_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="getusers_1-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[[Usuario](#schemausuario)]|false|none|none|
|» id|integer(int32)|false|none|none|
|» nome|string|true|none|none|
|» senha|string|true|none|none|
|» status|boolean|false|none|none|
|» tipoUsuario|string|false|none|none|
|» dadoUsuario|[DadoUsuario](#schemadadousuario)|false|none|none|
|»» id|integer(int32)|false|none|none|
|»» dataNascimento|string(date-time)|false|none|none|
|»» cpf|string|false|none|none|
|»» sexo|string|false|none|none|
|»» celular|string|false|none|none|
|»» telefone|string|false|none|none|
|»» email|string|false|none|none|
|»» estadoCivil|string|false|none|none|
|» endereco|[Endereco](#schemaendereco)|false|none|none|
|»» id|integer(int32)|false|none|none|
|»» cep|string|false|none|none|
|»» logradouro|string|false|none|none|
|»» numero|integer(int32)|false|none|none|
|»» complemento|string|false|none|none|
|»» referencia|string|false|none|none|
|»» bairro|string|false|none|none|
|»» municipio|string|false|none|none|
|»» estado|string|false|none|none|
|»» pais|string|false|none|none|
|» consultas|[[Consulta](#schemaconsulta)]|false|none|none|
|»» id|integer(int32)|false|none|none|
|»» data|string(date-time)|false|none|none|
|»» pacientes|[[Usuario](#schemausuario)]|false|none|none|
|»» observacao|string|false|none|none|

<aside class="success">
This operation does not require authentication
</aside>

## creatUser_1

<a id="opIdcreatUser_1"></a>

> Code samples

```shell
# You can also use wget
curl -X POST http://localhost:8080/v1/admin/users \
  -H 'Content-Type: application/json' \
  -H 'Accept: */*'

```

```http
POST http://localhost:8080/v1/admin/users HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: */*

```

```javascript
const inputBody = '{
  "id": 0,
  "nome": "string",
  "senha": "string",
  "status": true,
  "tipoUsuario": "string",
  "dadoUsuario": {
    "id": 0,
    "dataNascimento": "2019-08-24T14:15:22Z",
    "cpf": "string",
    "sexo": "string",
    "celular": "string",
    "telefone": "string",
    "email": "string",
    "estadoCivil": "string"
  },
  "endereco": {
    "id": 0,
    "cep": "string",
    "logradouro": "string",
    "numero": 0,
    "complemento": "string",
    "referencia": "string",
    "bairro": "string",
    "municipio": "string",
    "estado": "string",
    "pais": "string"
  },
  "consultas": [
    {
      "id": 0,
      "data": "2019-08-24T14:15:22Z",
      "pacientes": [
        {
          "id": 0,
          "nome": "string",
          "senha": "string",
          "status": true,
          "tipoUsuario": "string",
          "dadoUsuario": {
            "id": 0,
            "dataNascimento": "2019-08-24T14:15:22Z",
            "cpf": "string",
            "sexo": "string",
            "celular": "string",
            "telefone": "string",
            "email": "string",
            "estadoCivil": "string"
          },
          "endereco": {
            "id": 0,
            "cep": "string",
            "logradouro": "string",
            "numero": 0,
            "complemento": "string",
            "referencia": "string",
            "bairro": "string",
            "municipio": "string",
            "estado": "string",
            "pais": "string"
          },
          "consultas": []
        }
      ],
      "observacao": "string"
    }
  ]
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/admin/users',
{
  method: 'POST',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => '*/*'
}

result = RestClient.post 'http://localhost:8080/v1/admin/users',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': '*/*'
}

r = requests.post('http://localhost:8080/v1/admin/users', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('POST','http://localhost:8080/v1/admin/users', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/admin/users");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("POST");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("POST", "http://localhost:8080/v1/admin/users", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`POST /v1/admin/users`

> Body parameter

```json
{
  "id": 0,
  "nome": "string",
  "senha": "string",
  "status": true,
  "tipoUsuario": "string",
  "dadoUsuario": {
    "id": 0,
    "dataNascimento": "2019-08-24T14:15:22Z",
    "cpf": "string",
    "sexo": "string",
    "celular": "string",
    "telefone": "string",
    "email": "string",
    "estadoCivil": "string"
  },
  "endereco": {
    "id": 0,
    "cep": "string",
    "logradouro": "string",
    "numero": 0,
    "complemento": "string",
    "referencia": "string",
    "bairro": "string",
    "municipio": "string",
    "estado": "string",
    "pais": "string"
  },
  "consultas": [
    {
      "id": 0,
      "data": "2019-08-24T14:15:22Z",
      "pacientes": [
        {
          "id": 0,
          "nome": "string",
          "senha": "string",
          "status": true,
          "tipoUsuario": "string",
          "dadoUsuario": {
            "id": 0,
            "dataNascimento": "2019-08-24T14:15:22Z",
            "cpf": "string",
            "sexo": "string",
            "celular": "string",
            "telefone": "string",
            "email": "string",
            "estadoCivil": "string"
          },
          "endereco": {
            "id": 0,
            "cep": "string",
            "logradouro": "string",
            "numero": 0,
            "complemento": "string",
            "referencia": "string",
            "bairro": "string",
            "municipio": "string",
            "estado": "string",
            "pais": "string"
          },
          "consultas": []
        }
      ],
      "observacao": "string"
    }
  ]
}
```

<h3 id="creatuser_1-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[Usuario](#schemausuario)|true|none|

> Example responses

> 200 Response

<h3 id="creatuser_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Usuario](#schemausuario)|

<aside class="success">
This operation does not require authentication
</aside>

## getConsultas_1

<a id="opIdgetConsultas_1"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/v1/admin/consultas \
  -H 'Accept: */*'

```

```http
GET http://localhost:8080/v1/admin/consultas HTTP/1.1
Host: localhost:8080
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/admin/consultas',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.get 'http://localhost:8080/v1/admin/consultas',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.get('http://localhost:8080/v1/admin/consultas', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/v1/admin/consultas', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/admin/consultas");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/v1/admin/consultas", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /v1/admin/consultas`

> Example responses

> 200 Response

<h3 id="getconsultas_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="getconsultas_1-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[[Consulta](#schemaconsulta)]|false|none|none|
|» id|integer(int32)|false|none|none|
|» data|string(date-time)|false|none|none|
|» pacientes|[[Usuario](#schemausuario)]|false|none|none|
|»» id|integer(int32)|false|none|none|
|»» nome|string|true|none|none|
|»» senha|string|true|none|none|
|»» status|boolean|false|none|none|
|»» tipoUsuario|string|false|none|none|
|»» dadoUsuario|[DadoUsuario](#schemadadousuario)|false|none|none|
|»»» id|integer(int32)|false|none|none|
|»»» dataNascimento|string(date-time)|false|none|none|
|»»» cpf|string|false|none|none|
|»»» sexo|string|false|none|none|
|»»» celular|string|false|none|none|
|»»» telefone|string|false|none|none|
|»»» email|string|false|none|none|
|»»» estadoCivil|string|false|none|none|
|»» endereco|[Endereco](#schemaendereco)|false|none|none|
|»»» id|integer(int32)|false|none|none|
|»»» cep|string|false|none|none|
|»»» logradouro|string|false|none|none|
|»»» numero|integer(int32)|false|none|none|
|»»» complemento|string|false|none|none|
|»»» referencia|string|false|none|none|
|»»» bairro|string|false|none|none|
|»»» municipio|string|false|none|none|
|»»» estado|string|false|none|none|
|»»» pais|string|false|none|none|
|»» consultas|[[Consulta](#schemaconsulta)]|false|none|none|
|» observacao|string|false|none|none|

<aside class="success">
This operation does not require authentication
</aside>

## criarConsulta_1

<a id="opIdcriarConsulta_1"></a>

> Code samples

```shell
# You can also use wget
curl -X POST http://localhost:8080/v1/admin/consultas \
  -H 'Content-Type: application/json' \
  -H 'Accept: */*'

```

```http
POST http://localhost:8080/v1/admin/consultas HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: */*

```

```javascript
const inputBody = '{
  "id": 0,
  "data": "2019-08-24T14:15:22Z",
  "pacientes": [
    {
      "id": 0,
      "nome": "string",
      "senha": "string",
      "status": true,
      "tipoUsuario": "string",
      "dadoUsuario": {
        "id": 0,
        "dataNascimento": "2019-08-24T14:15:22Z",
        "cpf": "string",
        "sexo": "string",
        "celular": "string",
        "telefone": "string",
        "email": "string",
        "estadoCivil": "string"
      },
      "endereco": {
        "id": 0,
        "cep": "string",
        "logradouro": "string",
        "numero": 0,
        "complemento": "string",
        "referencia": "string",
        "bairro": "string",
        "municipio": "string",
        "estado": "string",
        "pais": "string"
      },
      "consultas": [
        {
          "id": 0,
          "data": "2019-08-24T14:15:22Z",
          "pacientes": [],
          "observacao": "string"
        }
      ]
    }
  ],
  "observacao": "string"
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/admin/consultas',
{
  method: 'POST',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => '*/*'
}

result = RestClient.post 'http://localhost:8080/v1/admin/consultas',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': '*/*'
}

r = requests.post('http://localhost:8080/v1/admin/consultas', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('POST','http://localhost:8080/v1/admin/consultas', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/admin/consultas");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("POST");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("POST", "http://localhost:8080/v1/admin/consultas", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`POST /v1/admin/consultas`

> Body parameter

```json
{
  "id": 0,
  "data": "2019-08-24T14:15:22Z",
  "pacientes": [
    {
      "id": 0,
      "nome": "string",
      "senha": "string",
      "status": true,
      "tipoUsuario": "string",
      "dadoUsuario": {
        "id": 0,
        "dataNascimento": "2019-08-24T14:15:22Z",
        "cpf": "string",
        "sexo": "string",
        "celular": "string",
        "telefone": "string",
        "email": "string",
        "estadoCivil": "string"
      },
      "endereco": {
        "id": 0,
        "cep": "string",
        "logradouro": "string",
        "numero": 0,
        "complemento": "string",
        "referencia": "string",
        "bairro": "string",
        "municipio": "string",
        "estado": "string",
        "pais": "string"
      },
      "consultas": [
        {
          "id": 0,
          "data": "2019-08-24T14:15:22Z",
          "pacientes": [],
          "observacao": "string"
        }
      ]
    }
  ],
  "observacao": "string"
}
```

<h3 id="criarconsulta_1-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[Consulta](#schemaconsulta)|true|none|

> Example responses

> 200 Response

<h3 id="criarconsulta_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Consulta](#schemaconsulta)|

<aside class="success">
This operation does not require authentication
</aside>

<h1 id="tcc-sgco-api-usuario-controller">usuario-controller</h1>

## getUserById

<a id="opIdgetUserById"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/v1/users/{id} \
  -H 'Accept: */*'

```

```http
GET http://localhost:8080/v1/users/{id} HTTP/1.1
Host: localhost:8080
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/users/{id}',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.get 'http://localhost:8080/v1/users/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.get('http://localhost:8080/v1/users/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/v1/users/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/users/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/v1/users/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /v1/users/{id}`

<h3 id="getuserbyid-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|

> Example responses

> 200 Response

<h3 id="getuserbyid-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Usuario](#schemausuario)|

<aside class="success">
This operation does not require authentication
</aside>

## pegarSenha

<a id="opIdpegarSenha"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/v1/getSenha/{id} \
  -H 'Accept: */*'

```

```http
GET http://localhost:8080/v1/getSenha/{id} HTTP/1.1
Host: localhost:8080
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/getSenha/{id}',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.get 'http://localhost:8080/v1/getSenha/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.get('http://localhost:8080/v1/getSenha/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/v1/getSenha/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/getSenha/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/v1/getSenha/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /v1/getSenha/{id}`

<h3 id="pegarsenha-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|

> Example responses

> 200 Response

<h3 id="pegarsenha-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|string|

<aside class="success">
This operation does not require authentication
</aside>

## getConsultaById_1

<a id="opIdgetConsultaById_1"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/v1/consultas/{id} \
  -H 'Accept: */*'

```

```http
GET http://localhost:8080/v1/consultas/{id} HTTP/1.1
Host: localhost:8080
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8080/v1/consultas/{id}',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.get 'http://localhost:8080/v1/consultas/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.get('http://localhost:8080/v1/consultas/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/v1/consultas/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/v1/consultas/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/v1/consultas/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /v1/consultas/{id}`

<h3 id="getconsultabyid_1-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int32)|true|none|

> Example responses

> 200 Response

<h3 id="getconsultabyid_1-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Consulta](#schemaconsulta)|

<aside class="success">
This operation does not require authentication
</aside>

# Schemas

<h2 id="tocS_JSONObject">JSONObject</h2>
<!-- backwards compatibility -->
<a id="schemajsonobject"></a>
<a id="schema_JSONObject"></a>
<a id="tocSjsonobject"></a>
<a id="tocsjsonobject"></a>

```json
{
  "empty": true,
  "property1": {},
  "property2": {}
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|**additionalProperties**|object|false|none|none|
|empty|boolean|false|none|none|

<h2 id="tocS_Consulta">Consulta</h2>
<!-- backwards compatibility -->
<a id="schemaconsulta"></a>
<a id="schema_Consulta"></a>
<a id="tocSconsulta"></a>
<a id="tocsconsulta"></a>

```json
{
  "id": 0,
  "data": "2019-08-24T14:15:22Z",
  "pacientes": [
    {
      "id": 0,
      "nome": "string",
      "senha": "string",
      "status": true,
      "tipoUsuario": "string",
      "dadoUsuario": {
        "id": 0,
        "dataNascimento": "2019-08-24T14:15:22Z",
        "cpf": "string",
        "sexo": "string",
        "celular": "string",
        "telefone": "string",
        "email": "string",
        "estadoCivil": "string"
      },
      "endereco": {
        "id": 0,
        "cep": "string",
        "logradouro": "string",
        "numero": 0,
        "complemento": "string",
        "referencia": "string",
        "bairro": "string",
        "municipio": "string",
        "estado": "string",
        "pais": "string"
      },
      "consultas": [
        {
          "id": 0,
          "data": "2019-08-24T14:15:22Z",
          "pacientes": [],
          "observacao": "string"
        }
      ]
    }
  ],
  "observacao": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|integer(int32)|false|none|none|
|data|string(date-time)|false|none|none|
|pacientes|[[Usuario](#schemausuario)]|false|none|none|
|observacao|string|false|none|none|

<h2 id="tocS_DadoUsuario">DadoUsuario</h2>
<!-- backwards compatibility -->
<a id="schemadadousuario"></a>
<a id="schema_DadoUsuario"></a>
<a id="tocSdadousuario"></a>
<a id="tocsdadousuario"></a>

```json
{
  "id": 0,
  "dataNascimento": "2019-08-24T14:15:22Z",
  "cpf": "string",
  "sexo": "string",
  "celular": "string",
  "telefone": "string",
  "email": "string",
  "estadoCivil": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|integer(int32)|false|none|none|
|dataNascimento|string(date-time)|false|none|none|
|cpf|string|false|none|none|
|sexo|string|false|none|none|
|celular|string|false|none|none|
|telefone|string|false|none|none|
|email|string|false|none|none|
|estadoCivil|string|false|none|none|

<h2 id="tocS_Endereco">Endereco</h2>
<!-- backwards compatibility -->
<a id="schemaendereco"></a>
<a id="schema_Endereco"></a>
<a id="tocSendereco"></a>
<a id="tocsendereco"></a>

```json
{
  "id": 0,
  "cep": "string",
  "logradouro": "string",
  "numero": 0,
  "complemento": "string",
  "referencia": "string",
  "bairro": "string",
  "municipio": "string",
  "estado": "string",
  "pais": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|integer(int32)|false|none|none|
|cep|string|false|none|none|
|logradouro|string|false|none|none|
|numero|integer(int32)|false|none|none|
|complemento|string|false|none|none|
|referencia|string|false|none|none|
|bairro|string|false|none|none|
|municipio|string|false|none|none|
|estado|string|false|none|none|
|pais|string|false|none|none|

<h2 id="tocS_Usuario">Usuario</h2>
<!-- backwards compatibility -->
<a id="schemausuario"></a>
<a id="schema_Usuario"></a>
<a id="tocSusuario"></a>
<a id="tocsusuario"></a>

```json
{
  "id": 0,
  "nome": "string",
  "senha": "string",
  "status": true,
  "tipoUsuario": "string",
  "dadoUsuario": {
    "id": 0,
    "dataNascimento": "2019-08-24T14:15:22Z",
    "cpf": "string",
    "sexo": "string",
    "celular": "string",
    "telefone": "string",
    "email": "string",
    "estadoCivil": "string"
  },
  "endereco": {
    "id": 0,
    "cep": "string",
    "logradouro": "string",
    "numero": 0,
    "complemento": "string",
    "referencia": "string",
    "bairro": "string",
    "municipio": "string",
    "estado": "string",
    "pais": "string"
  },
  "consultas": [
    {
      "id": 0,
      "data": "2019-08-24T14:15:22Z",
      "pacientes": [
        {
          "id": 0,
          "nome": "string",
          "senha": "string",
          "status": true,
          "tipoUsuario": "string",
          "dadoUsuario": {
            "id": 0,
            "dataNascimento": "2019-08-24T14:15:22Z",
            "cpf": "string",
            "sexo": "string",
            "celular": "string",
            "telefone": "string",
            "email": "string",
            "estadoCivil": "string"
          },
          "endereco": {
            "id": 0,
            "cep": "string",
            "logradouro": "string",
            "numero": 0,
            "complemento": "string",
            "referencia": "string",
            "bairro": "string",
            "municipio": "string",
            "estado": "string",
            "pais": "string"
          },
          "consultas": []
        }
      ],
      "observacao": "string"
    }
  ]
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|integer(int32)|false|none|none|
|nome|string|true|none|none|
|senha|string|true|none|none|
|status|boolean|false|none|none|
|tipoUsuario|string|false|none|none|
|dadoUsuario|[DadoUsuario](#schemadadousuario)|false|none|none|
|endereco|[Endereco](#schemaendereco)|false|none|none|
|consultas|[[Consulta](#schemaconsulta)]|false|none|none|

