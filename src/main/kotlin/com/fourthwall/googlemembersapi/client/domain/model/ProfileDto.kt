/**
* Google Members Api
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 0.0.1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.fourthwall.googlemembersapi.client.domain.model

import com.squareup.moshi.Json

data class ProfileDto (
    @Json(name = "sub")
    val sub: String,
    @Json(name = "email_verified")
    val emailVerified: Boolean?,
    @Json(name = "name")
    val name: String,
    @Json(name = "given_name")
    val givenName: String?,
    @Json(name = "locale")
    val locale: String?,
    @Json(name = "family_name")
    val familyName: String?,
    @Json(name = "picture")
    val picture: String?,
    @Json(name = "email")
    val email: String?
)