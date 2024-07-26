#!/bin/sh

readonly installerWrapperInstallationPath=/tmp/installer-wrapper.sh
readonly installerWrapperURL=https://raw.githubusercontent.com/dynatrace-oss/cloud-snippets/main/azure/linux-app-service/oneagent-installer.sh

wget -O $installerWrapperInstallationPath -q $installerWrapperURL
sh $installerWrapperInstallationPath