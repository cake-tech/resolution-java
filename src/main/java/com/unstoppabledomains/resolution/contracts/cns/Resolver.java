package com.unstoppabledomains.resolution.contracts.cns;

import java.math.BigInteger;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.unstoppabledomains.resolution.contracts.Contract;

public class Resolver extends Contract {
  private static final String jsonString = "[\n  {\n    \"inputs\": [\n      {\n        \"internalType\": \"contract Registry\",\n        \"name\": \"registry\",\n        \"type\": \"address\"\n      }\n    ],\n    \"payable\": false,\n    \"stateMutability\": \"nonpayable\",\n    \"type\": \"constructor\"\n  },\n  {\n    \"anonymous\": false,\n    \"inputs\": [\n      {\n        \"indexed\": true,\n        \"internalType\": \"uint256\",\n        \"name\": \"preset\",\n        \"type\": \"uint256\"\n      },\n      {\n        \"indexed\": true,\n        \"internalType\": \"string\",\n        \"name\": \"key\",\n        \"type\": \"string\"\n      },\n      {\n        \"indexed\": false,\n        \"internalType\": \"string\",\n        \"name\": \"value\",\n        \"type\": \"string\"\n      },\n      {\n        \"indexed\": true,\n        \"internalType\": \"uint256\",\n        \"name\": \"tokenId\",\n        \"type\": \"uint256\"\n      }\n    ],\n    \"name\": \"Set\",\n    \"type\": \"event\"\n  },\n  {\n    \"anonymous\": false,\n    \"inputs\": [\n      {\n        \"indexed\": true,\n        \"internalType\": \"uint256\",\n        \"name\": \"preset\",\n        \"type\": \"uint256\"\n      },\n      {\n        \"indexed\": true,\n        \"internalType\": \"uint256\",\n        \"name\": \"tokenId\",\n        \"type\": \"uint256\"\n      }\n    ],\n    \"name\": \"SetPreset\",\n    \"type\": \"event\"\n  },\n  {\n    \"constant\": true,\n    \"inputs\": [\n      {\n        \"internalType\": \"string\",\n        \"name\": \"key\",\n        \"type\": \"string\"\n      },\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"tokenId\",\n        \"type\": \"uint256\"\n      }\n    ],\n    \"name\": \"get\",\n    \"outputs\": [\n      {\n        \"internalType\": \"string\",\n        \"name\": \"\",\n        \"type\": \"string\"\n      }\n    ],\n    \"payable\": false,\n    \"stateMutability\": \"view\",\n    \"type\": \"function\"\n  },\n  {\n    \"constant\": true,\n    \"inputs\": [\n      {\n        \"internalType\": \"string[]\",\n        \"name\": \"keys\",\n        \"type\": \"string[]\"\n      },\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"tokenId\",\n        \"type\": \"uint256\"\n      }\n    ],\n    \"name\": \"getMany\",\n    \"outputs\": [\n      {\n        \"internalType\": \"string[]\",\n        \"name\": \"\",\n        \"type\": \"string[]\"\n      }\n    ],\n    \"payable\": false,\n    \"stateMutability\": \"view\",\n    \"type\": \"function\"\n  },\n  {\n    \"constant\": true,\n    \"inputs\": [\n      {\n        \"internalType\": \"address\",\n        \"name\": \"addr\",\n        \"type\": \"address\"\n      }\n    ],\n    \"name\": \"nonceOf\",\n    \"outputs\": [\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"\",\n        \"type\": \"uint256\"\n      }\n    ],\n    \"payable\": false,\n    \"stateMutability\": \"view\",\n    \"type\": \"function\"\n  },\n  {\n    \"constant\": true,\n    \"inputs\": [\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"tokenId\",\n        \"type\": \"uint256\"\n      }\n    ],\n    \"name\": \"presetOf\",\n    \"outputs\": [\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"\",\n        \"type\": \"uint256\"\n      }\n    ],\n    \"payable\": false,\n    \"stateMutability\": \"view\",\n    \"type\": \"function\"\n  },\n  {\n    \"constant\": false,\n    \"inputs\": [\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"tokenId\",\n        \"type\": \"uint256\"\n      }\n    ],\n    \"name\": \"reset\",\n    \"outputs\": [],\n    \"payable\": false,\n    \"stateMutability\": \"nonpayable\",\n    \"type\": \"function\"\n  },\n  {\n    \"constant\": false,\n    \"inputs\": [\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"tokenId\",\n        \"type\": \"uint256\"\n      },\n      {\n        \"internalType\": \"bytes\",\n        \"name\": \"signature\",\n        \"type\": \"bytes\"\n      }\n    ],\n    \"name\": \"resetFor\",\n    \"outputs\": [],\n    \"payable\": false,\n    \"stateMutability\": \"nonpayable\",\n    \"type\": \"function\"\n  },\n  {\n    \"constant\": false,\n    \"inputs\": [\n      {\n        \"internalType\": \"string\",\n        \"name\": \"key\",\n        \"type\": \"string\"\n      },\n      {\n        \"internalType\": \"string\",\n        \"name\": \"value\",\n        \"type\": \"string\"\n      },\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"tokenId\",\n        \"type\": \"uint256\"\n      }\n    ],\n    \"name\": \"set\",\n    \"outputs\": [],\n    \"payable\": false,\n    \"stateMutability\": \"nonpayable\",\n    \"type\": \"function\"\n  },\n  {\n    \"constant\": false,\n    \"inputs\": [\n      {\n        \"internalType\": \"string\",\n        \"name\": \"key\",\n        \"type\": \"string\"\n      },\n      {\n        \"internalType\": \"string\",\n        \"name\": \"value\",\n        \"type\": \"string\"\n      },\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"tokenId\",\n        \"type\": \"uint256\"\n      },\n      {\n        \"internalType\": \"bytes\",\n        \"name\": \"signature\",\n        \"type\": \"bytes\"\n      }\n    ],\n    \"name\": \"setFor\",\n    \"outputs\": [],\n    \"payable\": false,\n    \"stateMutability\": \"nonpayable\",\n    \"type\": \"function\"\n  },\n  {\n    \"constant\": false,\n    \"inputs\": [\n      {\n        \"internalType\": \"string[]\",\n        \"name\": \"keys\",\n        \"type\": \"string[]\"\n      },\n      {\n        \"internalType\": \"string[]\",\n        \"name\": \"values\",\n        \"type\": \"string[]\"\n      },\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"tokenId\",\n        \"type\": \"uint256\"\n      }\n    ],\n    \"name\": \"setMany\",\n    \"outputs\": [],\n    \"payable\": false,\n    \"stateMutability\": \"nonpayable\",\n    \"type\": \"function\"\n  },\n  {\n    \"constant\": false,\n    \"inputs\": [\n      {\n        \"internalType\": \"string[]\",\n        \"name\": \"keys\",\n        \"type\": \"string[]\"\n      },\n      {\n        \"internalType\": \"string[]\",\n        \"name\": \"values\",\n        \"type\": \"string[]\"\n      },\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"tokenId\",\n        \"type\": \"uint256\"\n      },\n      {\n        \"internalType\": \"bytes\",\n        \"name\": \"signature\",\n        \"type\": \"bytes\"\n      }\n    ],\n    \"name\": \"setManyFor\",\n    \"outputs\": [],\n    \"payable\": false,\n    \"stateMutability\": \"nonpayable\",\n    \"type\": \"function\"\n  },\n  {\n    \"constant\": false,\n    \"inputs\": [\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"presetId\",\n        \"type\": \"uint256\"\n      },\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"tokenId\",\n        \"type\": \"uint256\"\n      }\n    ],\n    \"name\": \"setPreset\",\n    \"outputs\": [],\n    \"payable\": false,\n    \"stateMutability\": \"nonpayable\",\n    \"type\": \"function\"\n  },\n  {\n    \"constant\": false,\n    \"inputs\": [\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"presetId\",\n        \"type\": \"uint256\"\n      },\n      {\n        \"internalType\": \"uint256\",\n        \"name\": \"tokenId\",\n        \"type\": \"uint256\"\n      },\n      {\n        \"internalType\": \"bytes\",\n        \"name\": \"signature\",\n        \"type\": \"bytes\"\n      }\n    ],\n    \"name\": \"setPresetFor\",\n    \"outputs\": [],\n    \"payable\": false,\n    \"stateMutability\": \"nonpayable\",\n    \"type\": \"function\"\n  }\n]";
  private static final JsonArray abi = new JsonParser().parse(Resolver.jsonString).getAsJsonArray();

  public Resolver(String url, String address) throws Exception {
    super(url, address, abi);
  }

  public String getRecord(String recordKey, BigInteger tokenID) throws Exception {
    Object[] args = new Object[2];
    args[0] = recordKey;
    args[1] = tokenID;
    return this.fetchOne("get", args);
  }
}
