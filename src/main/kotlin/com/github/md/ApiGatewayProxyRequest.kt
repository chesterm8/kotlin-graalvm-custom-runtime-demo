package com.github.md

class ApiGatewayProxyRequest {
    var path: String? = null
    var httpMethod: String? = null
    var headers: Map<String, String>? = emptyMap()
    var queryStringParameters: Map<String, String>? = emptyMap()
    var body: String? = ""
}