broadridge
==========

Create an utility to process 'proxy voting files'. The proxy voting files are in CSV format, a single line represents single message. The format of the single line is following: Columns A - AF are mandatory, columns from AG further are optional. Columns from AG further are repetitive, and have following structure: Proposal number, votes for, votes against and abstain votes. Only one number of votes can be non-zero for one proposal. Proposal number can have the following format: "[0-9]+\.[0-9]+". If the format does not contain the "." character, it is a standard proposal, if the format contains the "." character, it is cumulative voting proposal (the term will be explained later). There can be only one cumulative voting proposal per message.
The important part of the utility should be grouping of similar lines, two lines can be grouped together if following criteria are met:
1.	Safekeeping account (column N) must be the same
2.	First 6 characters of message reference (column D) must be the same
3.	CAOP (column T) must be the same
4.	Function of the message (column C) must be the same
5.	All of the proposals numbers are the same, and the non-zero numbers of votes are on the same position for all proposals.
During the grouping algorithm, the following columns need to be added:
1.	Quantity of instructions (Column U)
2.	Owned unit (Column AE)
3.	Proposal votes
The output should be the grouped lines in following format: Columns A-AF will stay the same (obviously, with the sum of the numbers if two or more lines were grouped). In the next column, the information from proposals will be stored in text format, which will look like:
If there is no cumulative proposal, and all proposals are 'for' proposals, it will be "ALL FAV"
If there is no cumulative proposal, and all proposals are 'against' proposals, it will be "ALL AGST"
If there is no cumulative proposal, and all proposals are 'abstain' proposals, it will be "ALL ABST"
If there is no cumulative proposal, and the proposals are mixed, there will be the keywords "FAV", "AGST" and "ABST" followed by the proposal number - e.g. "FAV 1,3,5 AGST 2 ABST 4,6".
If there is cumulative proposal included, it will be similar to the previous case, with the addition of the cumulative proposal - e.g. "FAV 1,3,5 AGST 2 ABST 6 CU_FAV 4.1,4.2 CU_AGST 4.3,4.4 CU_ABST 4.5"
Some of the sample data are included, please, include sample data covering all important cases with the solution.

