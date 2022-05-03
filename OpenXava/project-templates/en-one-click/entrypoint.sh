#!/bin/bash
mkdir -p /env

function echo_log {
  DATE='date +%Y/%m/%d:%H:%M:%S'
  echo `$DATE`" $1"
}

function export_java_env {
  java_environments=""
  echo_log "Exporting Java Environment Variables: JAVA_"

  while IFS='=' read -r name value ; do
    if [[ $name == *'JAVA_'* ]] && [[ $name != "JAVA_HOME" ]] && [[ $name != "JAVA_VERSION" ]]; then
      java_environments="$java_environments  ${!name} ";
    fi
  done < <(env)
  export CATALINA_OPTS="$java_environments"

}

function start_app {
  echo_log ""
  echo_log "Starting tomcat"
  bash catalina.sh run
}

########################
# Scripts starts here
########################
export_java_env
start_app
