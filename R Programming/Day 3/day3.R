setwd("R Programming/Datasets/")
car93 <- read.csv("Cars93.csv")
mean(car93$Price)

library(dplyr)
#install dplyr pakege first
summarise(car93,avg_price=mean(Price,na.rm=T),
          sd_price=sd(Price,na.rm=T))
a<-c(na,34,78,12)

grp_car93 <- group_by(car93,Type)
summarise(grp_car93,avg_price=mean(Price,na.rm=T),
          sd_price=sd(Price,na.rm=T))
#na.rm remove NA not aplicabel value
car93 %>%
  group_by(Type)%>%
  summarise(avg_price=mean(Price,na.rm=T),
            sd_price=sd(Price,na.rm=T))
sur <- read.csv("survey.csv",stringsAsFactors = T)
maleNonsmoker <- filter(sur,Sex=="Male"& Smoke == "Never")

pulseGT80 <- sur %>% filter(Pulse >80) %>% select(Sex,Exer,Smoke,Pulse)
pulseGT80

RtHand <- sur %>% mutate(Ratio_Hnd=Wr.Hnd / NW.Hnd) %>% select(Ratio_Hnd,Clap,Age)
RtHand

DescStats <- sur %>%  summarise(avg_price=mean(Age,na.rm=T),
            sd_price=sd(Age,na.rm=T))
DescStats

DescGrp <- sur %>%
  group_by(Sex)%>%
  summarise(avg_Age=mean(Age,na.rm=T),
            sd_Age=sd(Age,na.rm=T))
orders <- read.csv("Orders.csv")
ord_det <- read.csv("Ord_Details.csv")
df <- inner_join(orders,ord_det,by='Order.ID')

items<- read.csv("Items.csv")
combo_df<- inner_join(items,df,by="Item.ID")

#or

combo_df <- orders %>%
  inner_join(ord_det,by='Order.ID')%>%
  inner_join(items,by="Item.ID")

courses <-read.csv("Courses.csv")
sched <- read.csv("CourseSchedule.csv")

all_data <- sched %>% 
  rename(CourseID=CourseCode)%>%
  inner_join(courses,by="CourseID")

################tider#############

library(tidyr)
table4a
gather(table4a,'1999','2000',key='year',
       value='cases')

#or

table4a %>% gather('1999','2000',key='year',
                   value='cases')

#or

table4a %>% gather(-country,key='year',
                   value='cases')

table4a %>% gather(-country,key='year',
                   value="population")


table4a %>% pivot_longer(-c (country),names_to='year',
                   values_to = 'cases')

##############spreading #####
table2 %>% spread(key="type",value="count")

#or
table2 %>% pivot_wider(names_from = "type",
                       values_from = "count")
###############seprate
table3
table3%>% separate(rate,
                  into=c('cases','pop'),
                  convert = T)

####ubniting or concatening
table5
table5 %>%  unite(new_col,century,year,sep="")

stocks <- data.frame(year=c(rep(2015,4),rep(2016,3)),
                     qtr=c(1,2,3,4,2,3,4),
                     return=c(23,76,90,24,58,102,42))
stocks

stocks %>% complete(year,qtr)
mu_return <- mean(stocks$return, na.rm=T)
stocks %>% complete(year,qtr,
                    fill=list(return=mu_return))


sales<- data_frame(region=c(rep("North",3),rep("South",4),rep("East",4)),product=c("a","b","c","a","b","c","d","d","a","b","c"),
                            amt=c(23,54,67,23,10,10,36,78,29,12,33))

sales %>% complete(region,product)

###### Fill

df<- data.frame(region=c("North",NA,NA,"South",NA,NA,NA),sales=c(12,3,3,6,18,73,90))
df
df %>% fill(region) # it will fill null value on behalf of region 
# bydefault fill is downward 
# if you want upward filling -> then use direction ="up" in Fill function


#################################

com <- read.csv("Comb1.csv")
lng_combo1<- com


