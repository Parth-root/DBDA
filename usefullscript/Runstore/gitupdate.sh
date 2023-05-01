#!/bin/bash 
echo "updating......"
cd DBDA
git add DataVisualisation
git add Java
git add SQL
git add sync_to_linux
git add usefullscript
git commit -m "automated update"
git push https://github.com/dev2user/DBDA.git

