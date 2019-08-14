
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Test/de.idnow.example/conf/routes
// @DATE:Wed Aug 14 12:12:40 CEST 2019

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:7
  class ReverseRestController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def getAllIdents: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestController.getAllIdents",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/allIdentifications"})
        }
      """
    )
  
    // @LINE:7
    def addCompany: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestController.addCompany",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/addCompany"})
        }
      """
    )
  
    // @LINE:22
    def updateIdentification: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestController.updateIdentification",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/updateIdentification"})
        }
      """
    )
  
    // @LINE:16
    def removeIdent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestController.removeIdent",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/deleteIdent/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:23
    def updateCompany: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestController.updateCompany",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/updateCompany"})
        }
      """
    )
  
    // @LINE:17
    def removeComp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestController.removeComp",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/deleteComp/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:8
    def startIdentification: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestController.startIdentification",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/startIdentification"})
        }
      """
    )
  
    // @LINE:15
    def createComp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestController.createComp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/createComp"})
        }
      """
    )
  
    // @LINE:9
    def identifications: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestController.identifications",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/identifications"})
        }
      """
    )
  
    // @LINE:19
    def editComp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestController.editComp",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/editComp/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:20
    def editIdent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestController.editIdent",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/editIdent/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:12
    def getAllCompanies: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestController.getAllCompanies",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/companies"})
        }
      """
    )
  
    // @LINE:14
    def createIdents: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestController.createIdents",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/createIdents"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
