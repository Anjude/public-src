import pymysql
import os

os.environ.setdefault('MYSQL_ADDRESS', 'sh-cynosdbmysql-grp-3ze8gwlw.sql.tencentcdb.com:22307')
os.environ.setdefault('MYSQL_USERNAME', 'root')
os.environ.setdefault('MYSQL_PASSWORD', 'DMPFDt37')

pymysql.install_as_MySQLdb()
