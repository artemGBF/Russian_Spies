import tabula
# readinf the PDF file that contain Table Data
# you can find find the pdf file with complete code in below
# read_pdf will save the pdf table into Pandas Dataframe
#df = tabula.read_pdf("D:\DataScience\БДЗ\Skyteam_Timetable.pdf",multiple_tables=True)

tabula.convert_into ("D:\DataScience\БДЗ\Skyteam_Timetable.pdf", " offense_testing.csv", output_format = "csv")
# in order to print first 5 lines of Table
df.head()
