val build = SBuild("your-organization", "your-project", "0.0.1")
  .sourceDirectories("app")
  .testSourceDirectories("app-spec")
  .testDependencies( scala_test() )

val yourProject = ( project in file(".") ).settings( build.settings )