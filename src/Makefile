# Makefile, IVS projekt 2, DedSec
# author: Radoslav Grencik

javaSrc = MainCalculatorFX.java Controller.java IMath.java Math.java
otherSrc = ./GUI ./icons ./styles

Dir = makedir
jarDir = makedir/JAR
jarName = CalculatorFX
SD = StandartDeviation.java

groupName = xbolfr00_xgrenc00_xholub42_xvasic27
repo = ./mockup ./plan ./profiling ./src .git .gitignore debugging.png hodnoceni.txt LICENSE README.md screenshot.PNG skutecnost.txt dokumentace.pdf userManual.pdf
repoDir = makedir/xbolfr00_xgrenc00_xholub42_xvasic27/repo
docDir = makedir/xbolfr00_xgrenc00_xholub42_xvasic27/doc
installDir = makedir/xbolfr00_xgrenc00_xholub42_xvasic27/install
groupDir = makedir/xbolfr00_xgrenc00_xholub42_xvasic27

latexDir = makedir/doxy/latex
doxyDir = makedir/doxy

testLib = MathTest.java
JUNIT = java -cp .:/usr/share/java/junit.jar junit.textui.TestRunner

# compiles project
all: CalculatorFX

.PHONY: pack clean test doc run CalculatorFX

# compiles .java to .class then makes .jar
CalculatorFX:
	rm -rf ../$(jarDir)
	mkdir -p ../$(jarDir)
	cp -r $(otherSrc) ../$(jarDir)
	cd calculatorfx; javac -g -d ../../$(jarDir) $(javaSrc)
	cd ../$(jarDir); jar cfe $(jarName).jar calculatorfx.MainCalculatorFX *
	javac -g -d ../$(jarDir) $(SD)

# packs project
pack:
	rm -rf ../$(Dir)/$(groupName).zip
	mkdir -p ../$(repoDir); cd ../; cp -r $(repo) ./$(repoDir)
	mkdir -p ../$(docDir); cd ../; cp dokumentace.pdf ./$(docDir)
	mkdir -p ../$(installDir); cd ../; cp DedSec_Calculator_setup.exe ./$(installDir)
	cd ../$(Dir); zip -r $(groupName).zip $(groupName)
	cd ../; rm -rf $(groupDir)

# cleans everything that should not be uploaded
clean:
	rm -rf ../$(jarDir)

# runs MathTest (DOES NOT WORK...)
test:
	cd ./test; $(JUNIT) $(testLib)

# runs doxygen
doc:
	rm -rf ../doxyWarn.txt
	rm -rf ../dokumentace.pdf
	mkdir -p ../$(latexDir)
	cd ../; doxygen ./src/Doxyfile
	cd ../$(latexDir); latex refman.tex; dvips refman.dvi; ps2pdf refman.ps
	cd ../$(latexDir); latex refman.tex; dvips refman.dvi; ps2pdf refman.ps
	mv ../$(latexDir)/refman.pdf ../dokumentace.pdf
	cd ../; rm -rf $(doxyDir)

# runs .jar
run:
	cd ../$(jarDir); java -jar $(jarName).jar
