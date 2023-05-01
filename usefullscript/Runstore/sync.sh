#!/bin/bash
sudo mount -t ntfs /dev/sda5 /syncdevice
rm -Rfv /home/dbda/DBDA/sync_to_linux/
cp -r /syncdevice/sync_to_linux /home/dbda/DBDA
sudo umount /dev/sda5


