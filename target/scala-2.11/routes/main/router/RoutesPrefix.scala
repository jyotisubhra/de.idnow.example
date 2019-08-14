
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Test/de.idnow.example/conf/routes
// @DATE:Wed Aug 14 12:12:40 CEST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
