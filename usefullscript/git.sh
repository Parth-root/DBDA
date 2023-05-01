#!/bin/bash
user="dev2user"
pass="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"
expect -c '
spawn /home/dbda/Runstore/gitupdate.sh
expect {
"Username*" {send "'"$user"'\r"
exp_continue
}
"Password*" { send "'"$pass"'\r"
exp_continue
}
}'

