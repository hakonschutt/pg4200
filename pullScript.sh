echo "Lets make this SUPER easy mister...."
git checkout hakmaster
echo "checkingout hakmaster"
git add --all
git commit -m "Automateted push before merge"
git push --all
echo "Pushed everything to your personal branch"
echo 
echo
git checkout master 
git pull upstream master
git add --all
git commit -m "automatet commit after pull"
git push --all
git checkout mergebranch
git merge master
git add --all
git commit -m "automatet merge with master after pull"
git push --all
echo "everything seems to be working fine"

