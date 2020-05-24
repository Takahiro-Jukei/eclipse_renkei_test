create table charactors(
	charaId int not null AUTO_INCREMENT,
	charaName varchar(20) not null,
	primary key(charaId)
);

create table charaThread(
	threadId int not null AUTO_INCREMENT,
	charaId int not null,
	primary key(threadId)
);

create table chats(
	chatId int not null AUTO_INCREMENT,
	charaId int not null,
	name varchar(20),
	content varchar(200),
	postTime datetime not null,
	primary key(chatId)
);