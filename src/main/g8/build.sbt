val sbtBuild = SbtBuild("your-organization", "your-project", "0.0.1")
  .sourceDirectories("app")
  .testSourceDirectories("app-spec")
  .testDependencies( scalatest() )

val yourProject = ( project in file(".") ).settings( sbtBuild.settings )