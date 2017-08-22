echo "Lets make this SUPER easy mister...."
git checkout hakmaster
echo "checkingout hakmaster"
git add --all
git commit -m "Automateted push before merge"
git push --all
echo "Pushed everything to your personal branch"
echo 
echo "Checkingout master before upstream pull"
git checkout master 
git pull upstream master
git checkout mergebranch
git merge master
echo "everything seems to be working fine"

