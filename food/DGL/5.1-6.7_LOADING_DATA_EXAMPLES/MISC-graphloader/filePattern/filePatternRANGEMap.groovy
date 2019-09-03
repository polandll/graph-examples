/* SAMPLE INPUT
id|name|gender
001|Julia Child|F
*/

// CONFIGURATION
// Configures the data loader to create the schema
config dryrun: false, preparation: true, create_schema: false, load_new: true, schema_output: 'loader_output.txt'

// DATA INPUT
// Define the data input source (a file which can be specified via command line arguments)
// inputfiledir is the directory for the input files

inputfiledir = '/home/automaton/graph-examples/food/TEST/filePattern/data'
personInput = File.directory(inputfiledir).fileMatches("person[1-9].csv").delimiter('|').header('id','name','gender')

//Specifies what data source to load using which mapper (as defined inline)
  
load(personInput).asVertices {
    label "person"
    key "name"
}

/* RESULT:
   person1.csv and person2.csv will be loaded, but not badOne.csv
*/
