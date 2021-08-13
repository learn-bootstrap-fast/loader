for %%I in (*.json) do (

    mkdir "%%~pnI" 2>NUL
    copy /B "%%~fI" "%%~pnI\%%~nxI"
	echo %%~f
	copy /B C:%%~pnI* C:%%~pnI
)
