using System;
using System.IO;
using System.Net;
//Trecho retirado do site abaixo
//https://docs.microsoft.com/en-us/dotnet/framework/network-programming/how-to-request-data-using-the-webrequest-class
namespace Aula03_IS_APIs
{
    class GetMethodApi
    {


        public static void get()
        {
            // Create a request for the URL.
            WebRequest request = WebRequest.Create(
              "https://my-json-server.typicode.com/typicode/demo/posts");
            // If required by the server, set the credentials.
            //request.Credentials = CredentialCache.DefaultCredentials;

            // Get the response.
            WebResponse response = request.GetResponse();
            // Display the status.
            Console.WriteLine(((HttpWebResponse)response).StatusDescription);

            // Get the stream containing content returned by the server.
            // The using block ensures the stream is automatically closed.
            using (Stream dataStream = response.GetResponseStream())
            {
                // Open the stream using a StreamReader for easy access.
                StreamReader reader = new StreamReader(dataStream);
                // Read the content.
                string responseFromServer = reader.ReadToEnd();
                // Display the content.
                Console.WriteLine(responseFromServer);
            }

            // Close the response.
            response.Close();
        }
    }
}
