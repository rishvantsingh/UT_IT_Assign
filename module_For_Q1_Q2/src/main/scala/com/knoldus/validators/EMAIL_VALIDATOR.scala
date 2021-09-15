package com.knoldus.validators
import com.knoldus.models.emaill

import java.util.regex._
class EMAIL_VALIDATOR {
  val emailRegex: String = "^[_A-Za-z0-9]+@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
  val pattern: Pattern =Pattern.compile(emailRegex)

  def isEmailValid(email: emaill): Boolean = {
    val matcher:Matcher = pattern.matcher(email.emailAddress)
    matcher.matches
  }





}
