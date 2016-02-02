// Startup steps for:
// - connecting to Gremlin Server
// - dropping a graph
// - creating a graph
// - configuring a graph traversal

:remote connect tinkerpop.server resources/graph/gremlin-console/conf/remote-objects.yaml
:> system.dropGraph('test')
:> system.createGraph('test').ifNotExist().build()
:remote config alias g test.g