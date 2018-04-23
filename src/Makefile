# Makefile, IVS projekt 2, DedSec
# author: Radoslav Grencik

groupName = xbolfr00_xgrenc00_xholub42_xvasic27

javaSrc = ./calculatorfx/MainCalculatorFX.java ./calculatorfx/Controller.java ./calculatorfx/IMath.java ./calculatorfx/Math.java
otherSrc = ./GUI ./icons ./styles
Dir = makedir
jarDir = makedir/JAR
classDir = makedir/JAR/calculatorfx
repoDir = makedir/repo
docDir = makedir/doc
installDir = makedir/install
latexDir = makedir/doxy/latex
jarName = CalculatorFX
repo = ./mockup ./plan ./profiling ./src .gitignore debugging.png hodnoceni.txt LICENSE README.md screenshot.PNG skutecnost.txt dokumentace.pdf

testLib = MathTest.java
JUNIT = java -cp .:/usr/share/java/junit.jar org.junit.runner.JUnitCore

# compiles project
all: CalculatorFX

.PHONY: pack clean test doc run CalculatorFX

# compiles .java to .class then makes .jar
CalculatorFX:
	rm -rf ../$(jarDir)
	mkdir -p ../$(classDir)
	cp -r $(otherSrc) ../$(jarDir)
	javac -g -d ../$(classDir) $(javaSrc)
	cd ../$(jarDir); jar cfe $(JAR_NAME).jar calculatorfx.MainCalculatorFX *

# packs project
pack:
	rm -rf ../$(Dir)/$(GROUP_NAME).zip
	mkdir -p ../$(repoDir); cd ../; cp -r $(repo) ./$(repoDir)
	mkdir -p ../$(docDir); cd ../; cp dokumentace.pdf ./$(docDir)
	mkdir -p ../$(installDir); cd ../; cp DedSec_Calculator_setup.exe ./$(installDir)
	zip -r ../$(Dir)/$(GROUP_NAME).zip $(repoDir) $(docDir) $(installDir)
	cd ../; rm -rf $(repoDir) $(docDir) $(installDir)

# cleans everything that should not be uploaded
clean:
	rm -rf $(jarDir)

# runs MathTest
test:
	cd ./test; $(JUNIT) $(testLib)

# runs doxygen
doc:
	rm -rf ../dokumentace.pdf
	mkdir -p ../$(latexDir)
	doxygen Doxyfile
	cd ../$(latexDir); \
		latex refman.tex; \
		dvips refman.dvi; \
		ps2pdf refman.ps
	mv ../$(latexDir)/refman.pdf ../../dokumentace.pdf
	rm -rf ../$(latexDir)

# runs .jar
run:
	cd ../$(jarDir); java -jar $(JAR_NAME).jar
