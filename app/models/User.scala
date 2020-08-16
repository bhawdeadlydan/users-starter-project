package models

import play.api.libs.json.{Format, Json}

case class User(firstname: String, lastname: String, dob: String, address: String)

object User {
  implicit val format: Format[User] = Json.format[User]
  implicit val userReads = Json.reads[User]
}
