JGraphX
=======

JGraphX is a Java Swing diagramming (graph visualisation) library licensed under the BSD license. Although, the package 
names use that of 'mxGraph', this library is not called mxGraph. mxGraph is the JavaScript diagramming library 
that we sell commercially only (it isn't open source) - http://www.jgraph.com.

It was originally named JGraph through versions 1-5, this technically is version 6, but we changed the name to reflect 
the fact that the entire codebase and API was rewritten from scratch.

JGraphX provides functionality for visualisation and interaction with node-edge graphs (not charts). Example 
applications that you might write with it are a workflow editor, an organisational chart, a business process modelling 
tool, a UML tool, an electronic circuit diagrammer, network/telecoms visualisation (you get the idea, things with 
nodes and edges that connect those nodes, a mathematical graph).

JGraphX also includes functionality like XML stencils support, various import/export and layouting (automatically 
node/edge positioning).

Each tag in github creates a downloadable file at https://github.com/jgraph/jgraphx/tags. Older versions are at 
http://www.jgraph.com/jgraphdownload.html.

There is a user manual http://jgraph.github.com/mxgraph/docs/manual_javavis.html that explains the basic architecture. 

There are various examples, https://github.com/jgraph/jgraphx/tree/master/examples/com/mxgraph/examples/swing, from 
the usual HelloWorld to a more complete application example called GraphEditor.

There's also the API specifications at http://jgraph.github.com/mxgraph/java/docs/index.html

There is a 'jgraphx' tag on Stackoverflow - http://stackoverflow.com/questions/tagged/jgraphx, but please ensure 
you understand the SO FAQ and posting guidelines prior to posting. To post on SO you must 1) have a _question_ , 
2) that question be _programming_ related and 3) use the 'jgraphx' tag. If it's not a programming question, post 
on our Google+ stream instead - https://plus.google.com/b/114366056917507510100/114366056917507510100/posts.

JGraphX shares the changelog and version number of mxGraph, our JavaScript implementation of the same idea. This 
is because many people use the Java API on the server with mxGraph, so the model APIs have to be identical on each 
release. You have to filter the changelog, http://www.jgraph.com/mxchangelog.html for "Java" in the square brackets 
at the end of each line to see the changes that only apply to Java.
