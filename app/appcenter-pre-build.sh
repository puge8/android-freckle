#!/usr/bin/env bash

echo "================================================================================================================="
GOOGLE_JSON_FILE=$APPCENTER_SOURCE_DIRECTORY/app/google-services.json

echo "================================================================================================================="

echo $APPCENTER_SOURCE_DIRECTORY

if [ -e "$GOOGLE_JSON_FILE" ]
then
    echo "================================================================================================================="
    echo "Updating Google Json"
    echo "$GOOGLE_JSON" > $GOOGLE_JSON_FILE
    sed -i -e 's/\\"/'\"'/g' $GOOGLE_JSON_FILE

    echo "File content:"
    cat $GOOGLE_JSON_FILE
fi
echo "================================================================================================================="