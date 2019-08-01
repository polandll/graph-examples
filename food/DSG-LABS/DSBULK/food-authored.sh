#!/bin/bash

#**********************************
# food-book.sh
# Use dsbulk to add book data to graph
# Lorina Poland
#**********************************

repoDataDir="/home/automaton/graph-examples/food/DATA/CQL_CSV"

dsbulk load -k food_cql -t person_authored_book -url $repoDataDir/person_authored_book.csv -m '0=person_id, 1=person_name, 2=book_id, 3=book_name' -delim '|' -header true --schema.allowMissingFields true
