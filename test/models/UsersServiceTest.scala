package models

import org.scalatest.FunSuite
import services.UsersService

class UsersServiceTest extends FunSuite {

  test("should read users from json file.") {
    val usersService = new UsersService
    assert(usersService.getAll === Seq(
      User("John", "Smith", "1991-01-01", "11 Hilling Street"),
      User("Adam", "Taylor", "1981-02-01", "12 Baron Street")
    ))
  }
  test("should return empty users for non existent file path.") {
    val usersService = new UsersService
    usersService.setUsersRepository("non_existent_file_path")
    assert(usersService.getAll === Seq.empty[User])
  }
}