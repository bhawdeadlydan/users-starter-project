package services

import models.User
import play.api.libs.json._

import scala.io.Source
import models.User._

import scala.util.{Success, Using}


class UsersService {
  var usersJsonFile = "app/repositories/users.json"

  // Abstracting this for the tests
  def setUsersRepository(jsonFilePath: String): Unit = {
    usersJsonFile = jsonFilePath
  }

  def getAll: Seq[User] = {
    // Reading full json from the file is not very optimised.
    // We can change the format to json object per line
    // or a csv format that better for parsing data line by line.
    Using(Source.fromFile(usersJsonFile)) {
      _.mkString("")
    } match {
      case Success(jsonStringFromFile: String) =>
        Json.parse(jsonStringFromFile).as[Seq[User]]
      case _ => Seq.empty[User]
    }
  }
}
