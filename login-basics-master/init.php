<?php
$db_name = "jilee317";
$mysql_user = "jilee317";
$mysql_pass = "cunsim1154";
$server_name = "localhost";

$con = mysqli_connect($server_name,$mysql_user,$mysql_pass,$db_name);
if(!$con)
{
echo "Connection Error...".mysqli_connect_error();
}
else
{
echo "<h3>Database connection Success...</h3>";
}


?>