val build = SBuild("your-organization", "your-project", "0.0.1")
  .sourceDirectories("app")
  .scalaVersion("2.13.8")
  .testSourceDirectories("app-spec")
  .testDependencies( scalatest() )

val yourProject = ( project in file(".") ).settings( build.settings )