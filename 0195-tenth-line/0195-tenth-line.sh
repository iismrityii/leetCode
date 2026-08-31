# Read from the file file.txt and output the tenth line to stdout.
count=1

while read line
do
    if [ $count -eq 10 ]
    then
        echo "$line"
        break
    fi
    count=$((count + 1))
done < file.txt