package iii_liskov_substitution_principle;

/*

* Lsp: Derived or child classes must be substitutable for their base or parent classes

*/

public abstract class SocialMedia{

  // @support Whatsapp, Facebook, Instagram
  public abstract void chatWithFriend();

  // @support Facebook, Instagram  
  public abstract void publishPost(Object post);
  
  // @support Whatsapp, Facebook, Instagram
  public abstract void sendPhotosAndVideos();
  
  // @support Whatsapp, Facebook
  public abstract void groupVideoCall(String... users);
  
}

/*
 * Social media can have multiple implantation or can have multiple child 
   like:  Facebook, WhatsApp ,instagram and Twitter etc..

   But they all don't exhibit same properties like Whatsapp can't publish post...
 */