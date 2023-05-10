setwd("R Programming/Datasets/")
car93 <- read.csv("Cars93.csv")
dim(car93)
str(car93)

autocoll <- read.csv("AutoCollision.csv", 
                     stringsAsFactors = TRUE)
#autocoll <- read.csv("AutoCollision.csv")
str(autoco11)
#autocoll$age <- factor(autocall$age)

bollyw <- read.csv("Bollywood_2015_2.csv")
colnames(bollyw)<- c("movie","BO","Budget","Verdict")
dimonds<- read.csv("Diamonds.csv",sep = ";",dec = ",")
# or
dimonds<- read.csv2("Diamonds.csv")
#csv2 auto do : and , 
mem <- read.csv("members.txt",header = T,sep = " ",skip = 1)

###############reding excl ##################
library(readxl)
brupt <- read_excel("bankruptcy.xlsx",sheet = "data")
qual1 <- read_excel("quality.xlsx",sheet = "quality",
                   range = "A1:D6")
qual2 <- read_excel("quality.xlsx",sheet = "quality",
                   range = "H1:J16")
write.csv(qual2,"qual2.csv",row.names = F)
library()

autoco11[5,]
autoco11[1:5,]
autoco11[20:25,]
autoco11[,3:4]

ss <- subset(autoco11,Vehicle_Use == "Business")
ss2 <- subset(autoco11,Clim_Count > 400)
ss3 <- subset(autoco11,Age=="A" & Clim_Count > 400)


