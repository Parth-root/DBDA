#!/bin/bash
user="dbda"
expect -c '
spawn /home/dbda/Runstore/sync.sh
expect {
"*password*" {send "'"$user"'\r"
exp_continue
}
}'

