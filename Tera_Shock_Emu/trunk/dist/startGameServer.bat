@echo off
title Game Server Console
echo Starting Tera GameServer.
echo.
java -server -Dclient.encoding.override=UTF-8 -Dfile.encoding=UTF-8 -Djavax.management.builder.initial= -XX:-UseParallelGC -Xmx4098m -cp ./libs/*;stera.jar tera.gameserver.GameServer

if ERRORLEVEL 2 goto restart
if ERRORLEVEL 1 goto error
goto end
:restart
echo.
echo Server restarted ...
echo.
goto start
:error
echo.
echo Server terminated abnormaly ...
echo.
:end
echo.
echo Server terminated ...
echo.

pause
