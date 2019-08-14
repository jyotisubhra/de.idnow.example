
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Test/de.idnow.example/conf/routes
// @DATE:Wed Aug 14 12:12:40 CEST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:7
  RestController_2: controllers.RestController,
  // @LINE:27
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:7
    RestController_2: controllers.RestController,
    // @LINE:27
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, RestController_2, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, RestController_2, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/addCompany""", """controllers.RestController.addCompany()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/startIdentification""", """controllers.RestController.startIdentification()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/identifications""", """controllers.RestController.identifications()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/companies""", """controllers.RestController.getAllCompanies()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/allIdentifications""", """controllers.RestController.getAllIdents()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/createIdents""", """controllers.RestController.createIdents()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/createComp""", """controllers.RestController.createComp()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/deleteIdent/""" + "$" + """id<[^/]+>""", """controllers.RestController.removeIdent(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/deleteComp/""" + "$" + """id<[^/]+>""", """controllers.RestController.removeComp(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/editComp/""" + "$" + """id<[^/]+>""", """controllers.RestController.editComp(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/editIdent/""" + "$" + """id<[^/]+>""", """controllers.RestController.editIdent(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/updateIdentification""", """controllers.RestController.updateIdentification()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/updateCompany""", """controllers.RestController.updateCompany()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_RestController_addCompany1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/addCompany")))
  )
  private[this] lazy val controllers_RestController_addCompany1_invoker = createInvoker(
    RestController_2.addCompany(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "addCompany",
      Nil,
      "POST",
      """""",
      this.prefix + """api/v1/addCompany"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_RestController_startIdentification2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/startIdentification")))
  )
  private[this] lazy val controllers_RestController_startIdentification2_invoker = createInvoker(
    RestController_2.startIdentification(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "startIdentification",
      Nil,
      "POST",
      """""",
      this.prefix + """api/v1/startIdentification"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_RestController_identifications3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/identifications")))
  )
  private[this] lazy val controllers_RestController_identifications3_invoker = createInvoker(
    RestController_2.identifications(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "identifications",
      Nil,
      "GET",
      """""",
      this.prefix + """api/v1/identifications"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_RestController_getAllCompanies4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/companies")))
  )
  private[this] lazy val controllers_RestController_getAllCompanies4_invoker = createInvoker(
    RestController_2.getAllCompanies(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "getAllCompanies",
      Nil,
      "GET",
      """""",
      this.prefix + """api/v1/companies"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_RestController_getAllIdents5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/allIdentifications")))
  )
  private[this] lazy val controllers_RestController_getAllIdents5_invoker = createInvoker(
    RestController_2.getAllIdents(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "getAllIdents",
      Nil,
      "GET",
      """""",
      this.prefix + """api/v1/allIdentifications"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_RestController_createIdents6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/createIdents")))
  )
  private[this] lazy val controllers_RestController_createIdents6_invoker = createInvoker(
    RestController_2.createIdents(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "createIdents",
      Nil,
      "GET",
      """""",
      this.prefix + """api/v1/createIdents"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_RestController_createComp7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/createComp")))
  )
  private[this] lazy val controllers_RestController_createComp7_invoker = createInvoker(
    RestController_2.createComp(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "createComp",
      Nil,
      "GET",
      """""",
      this.prefix + """api/v1/createComp"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_RestController_removeIdent8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/deleteIdent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestController_removeIdent8_invoker = createInvoker(
    RestController_2.removeIdent(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "removeIdent",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """api/v1/deleteIdent/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_RestController_removeComp9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/deleteComp/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestController_removeComp9_invoker = createInvoker(
    RestController_2.removeComp(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "removeComp",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """api/v1/deleteComp/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_RestController_editComp10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/editComp/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestController_editComp10_invoker = createInvoker(
    RestController_2.editComp(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "editComp",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """api/v1/editComp/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_RestController_editIdent11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/editIdent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestController_editIdent11_invoker = createInvoker(
    RestController_2.editIdent(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "editIdent",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """api/v1/editIdent/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_RestController_updateIdentification12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/updateIdentification")))
  )
  private[this] lazy val controllers_RestController_updateIdentification12_invoker = createInvoker(
    RestController_2.updateIdentification(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "updateIdentification",
      Nil,
      "POST",
      """""",
      this.prefix + """api/v1/updateIdentification"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_RestController_updateCompany13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/updateCompany")))
  )
  private[this] lazy val controllers_RestController_updateCompany13_invoker = createInvoker(
    RestController_2.updateCompany(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "updateCompany",
      Nil,
      "POST",
      """""",
      this.prefix + """api/v1/updateCompany"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_versioned14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned14_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:7
    case controllers_RestController_addCompany1_route(params) =>
      call { 
        controllers_RestController_addCompany1_invoker.call(RestController_2.addCompany())
      }
  
    // @LINE:8
    case controllers_RestController_startIdentification2_route(params) =>
      call { 
        controllers_RestController_startIdentification2_invoker.call(RestController_2.startIdentification())
      }
  
    // @LINE:9
    case controllers_RestController_identifications3_route(params) =>
      call { 
        controllers_RestController_identifications3_invoker.call(RestController_2.identifications())
      }
  
    // @LINE:12
    case controllers_RestController_getAllCompanies4_route(params) =>
      call { 
        controllers_RestController_getAllCompanies4_invoker.call(RestController_2.getAllCompanies())
      }
  
    // @LINE:13
    case controllers_RestController_getAllIdents5_route(params) =>
      call { 
        controllers_RestController_getAllIdents5_invoker.call(RestController_2.getAllIdents())
      }
  
    // @LINE:14
    case controllers_RestController_createIdents6_route(params) =>
      call { 
        controllers_RestController_createIdents6_invoker.call(RestController_2.createIdents())
      }
  
    // @LINE:15
    case controllers_RestController_createComp7_route(params) =>
      call { 
        controllers_RestController_createComp7_invoker.call(RestController_2.createComp())
      }
  
    // @LINE:16
    case controllers_RestController_removeIdent8_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestController_removeIdent8_invoker.call(RestController_2.removeIdent(id))
      }
  
    // @LINE:17
    case controllers_RestController_removeComp9_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestController_removeComp9_invoker.call(RestController_2.removeComp(id))
      }
  
    // @LINE:19
    case controllers_RestController_editComp10_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestController_editComp10_invoker.call(RestController_2.editComp(id))
      }
  
    // @LINE:20
    case controllers_RestController_editIdent11_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestController_editIdent11_invoker.call(RestController_2.editIdent(id))
      }
  
    // @LINE:22
    case controllers_RestController_updateIdentification12_route(params) =>
      call { 
        controllers_RestController_updateIdentification12_invoker.call(RestController_2.updateIdentification())
      }
  
    // @LINE:23
    case controllers_RestController_updateCompany13_route(params) =>
      call { 
        controllers_RestController_updateCompany13_invoker.call(RestController_2.updateCompany())
      }
  
    // @LINE:27
    case controllers_Assets_versioned14_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned14_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
