#!/usr/bin/env bash

echo "Trying build script"
# Example: Change bundle name of an iOS app for non-production
if [ "$APPCENTER_BRANCH" != "ch-fix-failing-build" ];
then
    plutil -replace CFBundleName -string "\$(PRODUCT_NAME) Beta" $APPCENTER_SOURCE_DIRECTORY/MyApp/Info.plist
fi
